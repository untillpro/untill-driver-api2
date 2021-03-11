package com.untill.driver.interfaces.guestnotifier;

/**
 * A request to notify a guest about some event
 */
public class GuestNotifierCallRequest extends GuestNotifierRequest {

	/**
	 * Caller identifier
	 */
	private String callerId;
	
	private String customMessage;

	/**
	 * @return Returns custom message for Call request
	 */
	public String getCustomMessage() {
		return customMessage;
	}

	/**
	 * Sets custom message for Call request
	 * @param customMessage custom message to set
	 */
	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

	public String getCallerId() {
		return callerId;
	}

	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}
}
