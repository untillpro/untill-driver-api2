# Bills Handler - IBillsHandler

Bills handling driver gets called when one of the following events happens:
- Bill printed
- Bill re-opened
- Bill re-printed
- Proforma printed

Bills handling drivers support asynchronous error handling, for the cases 
when operation in case of failure should not block POS flow. To handle error asynchronously, Bills Handling driver may throw one of two exceptions:
- `EBillErrorAsyncResolution` - when this error thrown, POS continues normal flow, in one minute the same driver method is called again with the same arguments, in case of same failure error show in in POS allowing user to choose what to do:
  - Retry - another attempt of the same operation
  - Ignore - cancel this job, do not make more attempts of this operation
- `EBillErrorAsyncRetry` - POS continues normal flow, in one minute the same driver method is called again with the same arguments.

```java
public class MyBillsHandler implements IBillsHandler {    
    // ...

    @Override
    public BillsHandlerResult operation(DriverConfiguration cfg, BillsHandlerRequest request) {
        if (request instanceof BillClosingRequest) {
            try {
                getConnection(cfg).sendStatistics(request.getBill());
                return new BillsHandlerResult(); // Return empty result
            } catch (IOException e) {
                log.error("Error sending statistics", e);
                throw new EBillErrorAsyncResolution(e); 
            }
        }
        return null;
    }
}
```

