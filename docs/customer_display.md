# Customer display interface – ICustomerDisplay

The POS calls `ICustomerDisplay` methods asynchronously to provide better performance. RuntimeExceptions from calls are
handled in the background by logging them into `except.log`

Example implementation

```java
public class MyCustomerDisplay implements ICustomerDisplay {
	private final CustomerDisplayApiProvider provider;

	public MyCustomerDisplay(CustomerDisplayApiProvider provider) {
		this.provider = provider;
	}

	@Override
	public void displayOrder(DriverConfiguration cfg, DisplayOrder order) {
		provider.getApi(cfg).displayOrder(order);
	}

	@Override
	public void displayBill(DriverConfiguration cfg, DisplayBill bill) {
		provider.getApi(cfg).displayBill(bill);
	}

	@Override
	public void displayStandby(DriverConfiguration cfg) {
		provider.getApi(cfg).displayStandby();
	}
}
```