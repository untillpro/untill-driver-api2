package com.untill.driver.interfaces.cashmachine;

/**
 * Represents request for cash-machine <tt>Custom command</tt> operation
 */
public class CashMachineCustomCommandRequest extends CashMachineRequest {

	/**
	 * Custom command
	 */
	private String command;

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	@Override
	public String toString() {
		return "CashMachineCustomCommandRequest{"
				+ "command='" + command + '\''
				+ "} " + super.toString();
	}
}
