# Time and attendance operations handler - ITimeAttendance

Time and attendance operations handler could be used for `clock in`, `end break` or other operations.
Example implementation
```java
public class TimeAttendance implements ITimeAttendance {

	@Override
	public ReportHandlerResult operation(DriverConfiguration cfg, TARequest request) {
		if (request instanceof TAClockInRequest) {
			return handleTAClockInRequest(cfg);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```