# Cash operations handler - ICashHandler

Cash operations handler could be used for deposit, withdraw or other cash operations
Example implementation
```java
public class CashHandler implements ICashHandler {

	@Override
	public CashHandlerResult operation(DriverConfiguration cfg, CashHandlerRequest request) {
		if (request instanceof CashInOutRequest) {
			return handleCashInOutRequest(cfg, request);
		} else if (request instanceof CashDeclarationRequest) {
			return handleCashDeclarationRequest(cfg, request);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```