package com.untill.driver.interfaces.cashmachine;

import com.untill.driver.IDriverProgress;

/**
 * An instance of this class returned by {@link ICashMachine#getSettings()} to specify some details of driver behavior
 */
public class CashMachineSettings {
	/**
	 * Allows specifying if cash-machine driver supports cancelling operation by waiter (at
	 * ECR side). When true, unTill(r) POS shows "Cancel" button on a progress dialog.
	 * Driver must request {@link IDriverProgress#isCancelRequested(String)} to see if "Cancel" pressed by operator
	 */
	private boolean cancellingByWaiterSupported = false;

	public boolean isCancellingByWaiterSupported() {
		return cancellingByWaiterSupported;
	}

	public void setCancellingByWaiterSupported(boolean cancellingByWaiterSupported) {
		this.cancellingByWaiterSupported = cancellingByWaiterSupported;
	}
}
