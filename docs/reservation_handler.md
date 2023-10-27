# Reservation handler interface - IReservationHandler

Reservation handler interface could handle reservation updated operations
Example implementation

```java
public class ReservationHandler implements IReservationHandler {
	@Override
	public void reservationUpdated(DriverConfiguration cfg, Long id) {
		//You code goes here
	}
}
```