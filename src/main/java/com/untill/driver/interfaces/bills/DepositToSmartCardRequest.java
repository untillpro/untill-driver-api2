package com.untill.driver.interfaces.bills;

/**
 * A request for {@link ICustomBillsHandler} <tt>deposit to smart card</tt> operation
 */
public class DepositToSmartCardRequest extends CustomBillsHandlerRequest {

	private String smartCardUid;

	public String getSmartCardUid() {
		return smartCardUid;
	}

	public void setSmartCardUid(String smartCardUid) {
		this.smartCardUid = smartCardUid;
	}
}
