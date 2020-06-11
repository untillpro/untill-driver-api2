package com.untill.driver.interfaces.cashmachine;

import com.untill.driver.interfaces.DriverRequest;

/**
 * A basic class for all {@link ICashMachine} operations
 */
public abstract class CashMachineRequest extends DriverRequest {
	/**
	 * Waiter terminal ID
	 */
	private String waiterTerminalId;

	public String getWaiterTerminalId() {
		return waiterTerminalId;
	}

	public void setWaiterTerminalId(String waiterTerminalId) {
		this.waiterTerminalId = waiterTerminalId;
	}
}
