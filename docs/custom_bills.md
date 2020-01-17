# Custom bills handler - ICustomBillsHandler

Custom bills handler could be used for voucher purchase or other custom operations
Example implementation
```java
public class CustomBillsHandler implements ICustomBillsHandler {

	@Override
	public CustomBillsHandlerResult operation(DriverConfiguration cfg, CustomBillsHandlerRequest request) {
		if (request instanceof VoucherBillClosingRequest) {
			return handleVoucherBillClosingRequest(cfg, request);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```