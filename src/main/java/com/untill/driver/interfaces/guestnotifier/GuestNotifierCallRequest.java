package com.untill.driver.interfaces.guestnotifier;

/**
 * A request to notify a guest about some event
 */
public class GuestNotifierCallRequest extends GuestNotifierRequest {

	/**
	 * Caller identifier
	 */
	private Integer callerId;

	public Integer getCallerId() {
		return callerId;
	}

	public void setCallerId(Integer callerId) {
		this.callerId = callerId;
	}
}
