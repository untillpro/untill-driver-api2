# Tables handler interface - ITablesHandler

Tables handler interface could handle next operations
- Tables transfer
Example implementation
```java
public class TablesHandler implements ITablesHandler {

	@Override
	public TablesHandlerResult operation(DriverConfiguration cfg, TablesHandlerRequest req) {
		if (req instanceof TablesTransferRequest) {
			return handleTablesTransferRequest(cfg, req);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```