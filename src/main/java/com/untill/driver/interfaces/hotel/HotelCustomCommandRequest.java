package com.untill.driver.interfaces.hotel;

/**
 * Represents request for hotel "Custom command" operation
 *
 * @see IHotelInterface
 * @see HotelInterfaceRequest
 */
public class HotelCustomCommandRequest extends HotelInterfaceRequest {
	/**
	 * Command value
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
		return "HotelCustomCommandRequest{"
				+ "command='" + command + '\''
				+ "} " + super.toString();
	}
}
