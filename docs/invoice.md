# Invoice operations handler - IInvoiceHandler

Invoice operations handler could be used for print, re-print, payment or other invoice operations
Example implementation
```java
public class InvoiceHandler implements IInvoiceHandler {

	@Override
	public InvoiceHandlerResult operation(DriverConfiguration cfg, InvoiceHandlerRequest request) {
		if (request instanceof InvoicePrintedRequest) {
			return handleInvoicePrintedRequest(cfg, request);
		} else if (request instanceof InvoiceRePrintedRequest) {
			return handleInvoiceRePrintedRequest(cfg, request);
		} else if (request instanceof InvoicePayingRequest) {
			return handleInvoicePayingRequest(cfg, request);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```