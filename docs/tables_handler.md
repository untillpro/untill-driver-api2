# Tables operations handler - ITablesHandler
POS invokes this interface when
- Table is dirty
- Table is clean
  Example implementation
```java
public class TablesHandler implements ITablesHandler {

	@Override
	public void operation(DriverConfiguration cfg, TableChangedRequest req) {
		if (req instanceof TableDirtyChangedRequest) {
			return handleTableDirtyChangedRequest(cfg, req);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```