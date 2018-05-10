package com.untill.driver.interfaces.eft;

/**
 * Represents request for EFT "Custom command" operation
 *
 * @see			IEft
 * @see			EftRequest
 * @see			EftTransactionRequest
 */
public class EftCustomCommandRequest extends EftRequest {

	private String command;

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

}
