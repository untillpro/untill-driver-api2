# POS printer interface - IPosPrinter

POS printer interface could be used for `print`, `upload logo` or other operations.
Example implementation
```java
public class PosPrinter implements IPosPrinter {

	@Override
	public PosPrinterResult operation(DriverConfiguration cfg, PosPrinterRequest request) {
		if (request instanceof PosPrinterPrintRequest) {
			return handlePosPrinterPrintRequest(cfg, request);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```
