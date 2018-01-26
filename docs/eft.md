# EFT Interface

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

### Displaying custom data on bill ticket

### Returning pre-formatted tickets

## Void operation




## Custom commands