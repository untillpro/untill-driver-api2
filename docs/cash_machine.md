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
## Cash machine result
Cash machine result `must` has transaction result. Available transaction results:
- `SUCCESS` - indicates successful completion
- `DECLINED` - indicates that operation was declined
- `CANCELLED` - indicates that operation was cancelled by user

Cash machine result `could` has optional data accessible on ticket/receipt.

Example implementation
```java
class MyCachMashine implements ICashMachine {

	@Override
	public CashMachineSettings getSettings() {
		return new CashMachineSettings();
	}

	@Override
	public CashMachineResult operation(DriverConfiguration cfg, CashMachineRequest req) {
		CashMachineResult res = new CashMachineResult();
		if (success) {
			res.setTransactionResult(CashMachineTransactionResult.SUCCESS);
		} else if (declined){
			res.setTransactionResult(CashMachineTransactionResult.DECLINED);
		} else {
			res.setTransactionResult(CashMachineTransactionResult.CANCELLED);
		}
		res.getData().put("input-money", "10.00");
		res.getData().put("output-money", "2.00");
		return res;
	}
}
```