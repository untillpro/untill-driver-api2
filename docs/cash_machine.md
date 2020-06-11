# Cash-machine interface - ICashMachine

Cash-machine interface is used for handling cash operations with cash-machines. Also interface has settings for 
behaviour customization

Example implementation
```java
class MyCashMachine implements ICashMachine {

	@Override
	public CashMachineSettings getSettings() {
		CashMachineSettings settings = new CashMachineSettings();
		settings.setCancellingByWaiterSupported(true);
		return settings;
	}

	@Override
	public CashMachineResult operation(DriverConfiguration cfg, CashMachineRequest req) {
		if (req instanceof CashMachinePaymentRequest) {
			return pay(cfg, req);
		} else {
			throw new IllegalArgumentException(String.format("Operation %s not supported", req.getClass().getSimpleName()));
		}
	}
}
```