# EFT Interface - IEft
## Operations
This interface allows handling card payment operations. `operation` method gets a request object. This object, depending on the POS action, is an instance of class:

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
