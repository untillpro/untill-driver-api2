# Reservation handler interface - IReservationHandler

Reservation handler interface could handle next operations
- Tables modification
  Example implementation
```java
public class ReservationHandler implements IReservationHandler {

	@Override
	public ReservationHandlerResult operation(DriverConfiguration cfg, ReservationHandlerRequest req) {
		if (req instanceof ReservationTablesModificationRequest) {
			return handleReservationTablesModificationRequest(cfg, req);
		} else {
			throw new IllegalArgumentException("Operation not supported");
		}
	}
}
```