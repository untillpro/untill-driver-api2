# POS printer interface - IPosPrinter

POS printer interface could be used for `print`, `upload logo` or other operations.
Example implementation
```java
public class PosPrinter implements IPosPrinter {
	
	@Override
	public void operation(DriverConfiguration cfg, PosPrinterRequest request) {
		if (request instanceof PosPrinterPrintRequest) {
			handlePosPrinterPrintRequest(cfg, request);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```
