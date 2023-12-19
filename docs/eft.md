# EFT Interface - IEft

## Card Payment Operations
[IEft interface](../src/main/java/com/untill/driver/interfaces/eft/IEft.java) allows handling card payment operations - actions with unTill(r) payment modes having kind "Card".
For such payment modes you should choose your driver as an EFT interface in Backoffice, then your driver starts receiving commands from POS.

`IEft.operation` method gets a request object. This object, depending on the POS action, is an instance of class:

- Transaction requests:
  - EftPaymentRequest
  - EftReturnRequest
  - EftPreAuthRequest
- Transaction modification requests:
  - EftVoidRequest
  - EftTipsRequest
  - EftResetTipsRequest
  - EftCompletionRequest

A result of the operation is returned in `EftResult` instance with transaction result specified (success, cancelled, rejected), and optional transaction data.

```java
@Override
public EftResult operation(DriverConfiguration cfg, EftRequest request) {

    MySrvConnection con = new MySrvConnection(cfg);

    if (request instanceof EftPaymentRequest) {
        con.payment((EftPaymentRequest) request);
        if (con.success())
            return new EftResult.Builder().setTransactionResult(
                EftTransactionResult.SUCCESS)
                    .putData(EftResultFields.MASKED_CARD_NUMBER, con.cardNumber())
                    .putData(EftResultFields.CONTROL_NO, con.transactionNo()).build();
        else if (con.isUserCancelled())
            return new EftResult.Builder().setTransactionResult(
                EftTransactionResult.CANCELLED).build();
        else
            return new EftResult.Builder().setTransactionResult(
                EftTransactionResult.DECLINED).build();

    }
    return null;
}
```

The meaning of transaction requests is to create new EFT transaction. If it was successful, a significant data is returned in `EftResult` (masked card number, unique transaction identifier, etc). All this data saved in database by unTill and can be used for printing on a bills and reports.

Transaction modification requests are always modificate previously executed transaction. For example, payment request returns transaction identifier which is passed to unTill in `EftResult.data[EftResultFields.CONTROL_NO]`. In case when this transaction is later voided, `operation` method called with `EftVoidRequest` as an argument, with a transaction identifier in `EftVoidRequest.data[EftResultFields.CONTROL_NO]`. This way void operation knows which exactly transaction is voided.

### Printing data on a tickets
Any data returned in `EftResult.data` map can be printed: on the bill tickets and/or reports. If you use keys predefined in `EftResultFields` class, you can use fields from unTill(r) datasets "Payment" and "Payments": "(Card) Maked PAN", etc, for printing this data. In case you use custom keys, there is also a possibility to print data, using `NV.val(map, key)` function on a ticket layout, passing "(Card) Misc Data" field value as the first argument, and your key as a second argument.

### Returning pre-formatted receipts
Sometimes you receive a pre-formatted multiline receipt from the EFT interface which contains all the transaction data in a printable form. 
A good solution would be to return this ticket(s) to unTill for saving and printing. 
When you configure EFT driver in unTill(r) Beckoffice, there is a setting called "EFT Receipt". If you set this property, the specified layout will be printed either after each EFT operation, or declined EFT operations only (as you choose). To configure this layout, use fields from "EFT Payment Receipt" unTill(r) dataset. It shows all the data from `EftResult.data` map returned by the EFT driver, so you can display pre-formatted receipts using `NV.val(map, key)` function on the ticket. Option "Multiline" must be enabled for that field on the ticket.

### Showing POS message
There is a possibility to show some text in POS after `EftPaymentRequest` or `EftReturnRequest` processed. Use `displayMessage` property of the `EftResult` class. When driver returns non-null value, POS shows the screen with text and "Ok" button.

## Gift card operations
The same `IEft` interface is used for working with Gift Card operations (actions with unTill(r) payment modes having kind "Gift Card"). Regarding payments it works close to regular card payments, there are following requests for working with giftcard payments:
- EftGiftCardPaymentRequest - when payment is done and the amount is positive;
- EftGiftCardReloadRequest - when payment is done and the amount is negative;
- EftGiftCardCancelRequest - when re-open is done for this payment.

Before executing any of these request, unTill(r) POS shows the popup asking type or scan the card number, and this value is provided then in request. `EftGiftCardCancel` request works very similar to `EftVoidRequest`, providing details of the original transaction which must be cancelled. However, due to security reasons unTill(r) POS will ask for the card number before executing this operation. It's up to driver developer to check the validity of the card, or directly revert the original transaction using the data provided in `EftGiftCardCancel` request.

Besides payments, there are also number of gift card operations available which are used on `Gift Card Management` unTill(r) POS screen:
- EftGiftCardActivateRequest - card activation
- EftGiftCardDeactivateRequest - card deactivation
- EftGiftCardReadRequest - reading card balance
- EftGiftCardReloadRequest - reloading card, e.g. adding some amount to the giftcard
- EftGiftCardCancelRequest - cancelling some transaction (activation, deactivation, reloading, also used to cancel gift card payment).

Driver should return instance of `EftResult` in response of any of these gift card operation requests, or throw error when request is not supported. Current balance returned in `EftResult.data` under key `EftResultFields.CURRENT_BALANCE` (in cents). 
Some data may be returned for showing on receipts. For example operations which change balance may return previous balance, returning the value in `EftResult.data` under key `EftResultFields.OLD_BALANCE` (in cents). Other keys from `EftResultFields` may be also used to indicate card type, masked card number, etc. 

## Custom commands
There is a way to execute any custom command if you need this in your interface: re printing last ticket, closing the day, etc. 

```java
  @Override
  public EftResult operation(DriverConfiguration cfg, EftRequest request) {
    if (request instanceof EftPaymentRequest) {
      return this.payment((EftPaymentRequest)request);
    } else if (request instanceof EftCustomCommandRequest) {
      EftCustomCommandRequest ccr = (EftCustomCommandRequest)request;
      if ("balance".equals(ccr.getCommand())) 
        return this.closeDay();
      else if ("repeatLastReceipt".equals(ccr.getCommand()))
        return this.repeatLastReceipt();
      else
        throw new RuntimeException("Unsupported command");
    }
    throw new RuntimeException("Request not supported");
  }
```

When setting up the button for a custom command in unTill(r) screen, layout for receipt printing may be also specified. EFT driver may return any data, including pre-formatted receipts, to be printed by unTill(r) as a result of custom command operation. Use "EFT Payment Receipt" unTill(r) dataset for this layout, just as described in previous section.

# I/O operations
Some EFT devices able to interact with other things like ID cards. There are supported requests: 
- EftReadInputRequest - read input data

## Iteracting with user
Your driver may report some text messages as the current operation status, these messages will be displayed in POS instead of "Please wait" title which is shown by default. This helps user to understand what happens if operation takes a while.
```java
ctx.getProgress().showProgressMessage(guid, "Waiting for the answer from bank");
```

It is also possible to post some question which is displayed in POS and needs to be answered with "Yes" or "No". This may be used for example for the signature validation, [See example](https://github.com/michael-say/untill-driver-devkit-queries-example/blob/master/src/main/java/com/untill/drivers/example/TestQueryDriver.java).     

## EFT Settings
There is a way to customize some default EFT driver behaviour:
```java
  @Override
  public EftSettings getEftSettings() {
    EftSettings settings = new EftSettings();
    settings.setWaitTimeout(3 * 60 * 1000);
    settings.setCancellingByWaiterSupported(true);
    settings.setTipsReplaced(false);
    settings.setVoidWhenSameDay(true);
    return settings;
  }
```

- `waitTimeout` overrides default 90 second timeout.
- `vancellingByWaiterSupported` return true if you want to support cancelling from POS. In this way unTill(r) shows "Cancel" button on "Wait please" popup and sends cancel signal to EFT driver which can be caught using [IDriverProgress](progress.md) interface.
- `tipsReplaced` - indicates if each `EftTipsRequest` operation replaces previous tips amount for the transaction (true) or adds amount (false).
- `voidWhenSameDay` indicates if "void" operation must be used instead of "return" when re-opening bill within the same working hours (true). Otherwise (false) "return" operation executed.
- `tipsIncludedInReturn` - **true** when tips amount included (if exists) in RETURN or VOID request
