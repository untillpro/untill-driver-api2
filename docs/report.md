# Report operations handler - IReportHandler

Report operations handler could be used for print, re-print or other report operations
Example implementation
```java
public class ReportHandler extends AbstractHandler implements IReportHandler {

	@Override
	public ReportHandlerResult operation(DriverConfiguration cfg, ReportHandlerRequest request) {
		if (request instanceof ZReportPrintingRequest || request instanceof ZReportRePrintingRequest) {
			return handleZReportRequest(cfg);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```