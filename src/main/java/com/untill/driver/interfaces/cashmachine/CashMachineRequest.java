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
	/**
	 * Waiter name
	 */
	private String waiterName;

	public String getWaiterTerminalId() {
		return waiterTerminalId;
	}

	public void setWaiterTerminalId(String waiterTerminalId) {
		this.waiterTerminalId = waiterTerminalId;
	}

	public String getWaiterName() {
		return waiterName;
	}

	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}

	@Override
	public String toString() {
		return "CashMachineRequest{"
				+ "waiterTerminalId='" + waiterTerminalId + '\''
				+ ", waiterName='" + waiterName + '\''
				+ "} " + super.toString();
	}
}
