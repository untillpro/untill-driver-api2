# Driver Execution Progress

Some driver functions execution may take long time. There is a possibility to show progress status message, or interrupt execution from unTill(r) side (cancel operation by waiter). Use `IDriverProgress` interface which is available from `IDriverContext.getProgress()` and provides 2 methods:
- `isCancelRequested` - returns true when user pressed "Cancel" in POS progress dialog;
- `showProgressMessage` - shows text message in POS progress dialog.

In the example below driver starts a payment request and keeps waiting for an answer. While waiting, it shows current status and handles cancelling at POS side:

```java
@Override
public EftResult operation(DriverConfiguration cfg, EftRequest request) {

    if (request instanceof EftPaymentRequest)
        return payment(new MySrvConnection(cfg), ctx.getProgress(), (EftPaymentRequest) request);

    throw new RuntimeException("Request not supported: " + 
            request.getClass().getName());
}

EftResult payment(MySrvConnection con, IDriverProgress progress, 
        EftPaymentRequest req) {
    
    String rGuid = req.getGuid();
    ctx.getProgress().showProgressMessage(rGuid, "Sending request");
    con.sendPaymentRequest(req);

    while (!con.isResponseReceived()) {
        if (ctx.getProgress().isCancelRequested(rGuid)) { // Cancelled at
                                                            // POS
            con.cancelRequest();
            return new EftResult.Builder().setTransactionResult(
                    EftTransactionResult.CANCELLED).build();
        } else
            ctx.getProgress().showProgressMessage(rGuid, 
                    con.getCurrentStatus());
    }

    if (con.success())
        return new EftResult.Builder()
                .setTransactionResult(EftTransactionResult.SUCCESS)
                .putData(EftResultFields.MASKED_CARD_NUMBER, 
                        con.cardNumber())
                .putData(EftResultFields.CONTROL_NO, 
                        con.transactionNo()).build();
    else if (con.isUserCancelled()) // Cancelled by terminal
        return new EftResult.Builder()
                .setTransactionResult(EftTransactionResult.CANCELLED).build();
    else
        return new EftResult.Builder()
                .setTransactionResult(EftTransactionResult.DECLINED).build();
}
```
