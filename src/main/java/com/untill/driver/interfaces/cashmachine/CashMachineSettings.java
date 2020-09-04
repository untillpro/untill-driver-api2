package com.untill.driver.interfaces.cashmachine;

import com.untill.driver.IDriverProgress;

/**
 * An instance of this class returned by {@link ICashMachine#getSettings()} to specify some details of driver behavior
 */
public class CashMachineSettings {

	protected static final int DEFAULT_WAIT_TIMEOUT = 180000;

	/**
	 * Allows specifying if cash-machine driver supports cancelling operation by waiter (at
	 * ECR side). When true, unTill(r) POS shows "Cancel" button on a progress dialog.
	 * Driver must request {@link IDriverProgress#isCancelRequested(String)} to see if "Cancel" pressed by operator
	 */
	private boolean cancellingByWaiterSupported = false;

	/**
	 * Timeout telling how long unTill waits for an answer from driver before it shows <tt>Timeout</tt> error.
	 * Timeout in milliseconds
	 */
	private int waitTimeout = DEFAULT_WAIT_TIMEOUT;

	public boolean isCancellingByWaiterSupported() {
		return cancellingByWaiterSupported;
	}

	public void setCancellingByWaiterSupported(boolean cancellingByWaiterSupported) {
		this.cancellingByWaiterSupported = cancellingByWaiterSupported;
	}

	public int getWaitTimeout() {
		return waitTimeout;
	}

	public void setWaitTimeout(int waitTimeout) {
		this.waitTimeout = waitTimeout;
	}

	public static class Builder {

		private CashMachineSettings s = new CashMachineSettings();

		public Builder() {
		}

		public Builder setCancellingByWaiterSupported(boolean cancellingByWaiterSupported) {
			s.setCancellingByWaiterSupported(cancellingByWaiterSupported);
			return this;
		}

		public Builder setWaitTimeout(int waitTimeout) {
			s.setWaitTimeout(waitTimeout);
			return this;
		}

		public CashMachineSettings build() {
			return s;
		}
	}
}
