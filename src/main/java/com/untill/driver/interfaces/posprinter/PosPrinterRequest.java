package com.untill.driver.interfaces.posprinter;

import com.untill.driver.interfaces.DriverRequest;

public abstract class PosPrinterRequest extends DriverRequest {
	/**
	 * Handheld terminal IP address. This field is filled when request initiator is handheld terminal
	 */
	private String hhtIp;

	public String getHhtIp() {
		return hhtIp;
	}

	public void setHhtIp(String hhtIp) {
		this.hhtIp = hhtIp;
	}

	@Override
	public String toString() {
		return "PosPrinterRequest{"
				+ "hhtIp='" + hhtIp + '\''
				+ "} "
				+ super.toString();
	}
}
