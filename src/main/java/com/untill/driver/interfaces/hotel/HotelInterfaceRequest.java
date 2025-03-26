package com.untill.driver.interfaces.hotel;

import com.untill.driver.interfaces.DriverRequest;

/**
 * Basic class for {@link IHotelInterface} methods requests
 */
public class HotelInterfaceRequest extends DriverRequest {
	private Long waiterId;

	public Long getWaiterId() {
		return waiterId;
	}

	public void setWaiterId(Long waiterId) {
		this.waiterId = waiterId;
	}

	@Override
	public String toString() {
		return "HotelInterfaceRequest{"
				+ "waiterId=" + waiterId
				+ "} " + super.toString();
	}
}
