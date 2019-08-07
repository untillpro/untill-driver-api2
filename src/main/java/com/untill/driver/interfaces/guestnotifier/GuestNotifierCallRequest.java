package com.untill.driver.interfaces.guestnotifier;

/**
 * A request to notify a guest about some event
 */
public class GuestNotifierCallRequest extends GuestNotifierRequest {

	/**
	 * Caller identifier
	 */
	private String callerId;

	public String getCallerId() {
		return callerId;
	}

	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}
}
