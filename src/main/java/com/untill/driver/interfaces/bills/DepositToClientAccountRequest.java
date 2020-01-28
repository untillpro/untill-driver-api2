package com.untill.driver.interfaces.bills;

/**
 * A request for {@link ICustomBillsHandler} <tt>deposit to client account</tt> operation
 */
public class DepositToClientAccountRequest extends CustomBillsHandlerRequest {

	private Long clientId;

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
}
