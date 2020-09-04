# Cash-machine interface - ICashMachine

Cash-machine interface is used for handling cash operations with cash-machines. 

Example implementation
```java
class MyCashMachine implements ICashMachine {

	@Override
	public CashMachineSettings getSettings() {
		return new CashMachineSettings();
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

## Cash machine settings
There is a way to customize some default driver behaviour
```java
@Override
public CashMachineSettings getSettings() {
	return new CashMachineSettings.Builder()
			.setCancellingByWaiterSupported(true)
			.setWaitTimeout(210 * 1000)
			.build();
}
```
- `cancellingByWaiterSupported` - return true if you want to support cancelling from POS. In this way unTill(r) shows 
`Cancel` button on `Wait please...` popup and sends cancel signal to driver which can be caught using 
[IDriverProgress](progress.md) interface.
- `waitTimeout` - overrides default 180 second timeout.

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