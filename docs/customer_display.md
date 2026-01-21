# Customer display interface – ICustomerDisplay

The POS calls `ICustomerDisplay` methods asynchronously to provide better performance. RuntimeExceptions from calls are
handled in the background by logging them into `except.log`

Example implementation

```java
public class MyCustomerDisplay implements ICustomerDisplay {
	private final CustomerDisplayApi api;

	public MyCustomerDisplay(CustomerDisplayApi api) {
		this.api = api;
	}

	@Override
	public void displayOrder(DisplayOrder order) {
		api.displayOrder(order);
	}

	@Override
	public void displayBill(DisplayBill bill) {
		api.displayBill(bill);
	}

	@Override
	public void displayStandby() {
		api.displayStandby();
	}
}
```