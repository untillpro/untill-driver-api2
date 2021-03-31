package com.untill.driver.interfaces.eft;

import com.untill.driver.interfaces.DriverRequest;

/**
 * A basic class for all {@link IEft} requests
 *
 * @see IEft
 */

public class EftRequest extends DriverRequest {

	private String waiterTerminalId;

	public String getWaiterTerminalId() {
		return waiterTerminalId;
	}

	public void setWaiterTerminalId(String waiterTerminalId) {
		this.waiterTerminalId = waiterTerminalId;
	}

	@Override
	public String toString() {
		return "EftRequest{"
				+ "waiterTerminalId='" + waiterTerminalId + '\''
				+ "} " + super.toString();
	}
}
