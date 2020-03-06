package com.untill.driver.interfaces.bills;

/**
 * A request for {@link ICustomBillsHandler} <tt>deposit to gift card</tt> operation
 */
public class DepositToGiftCardRequest extends CustomBillsHandlerRequest {

	private String giftCardId;

	public String getGiftCardId() {
		return giftCardId;
	}

	public void setGiftCardId(String giftCardId) {
		this.giftCardId = giftCardId;
	}

	@Override
	public String toString() {
		return "DepositToGiftCardRequest{"
				+ "giftCardId='" + giftCardId + '\''
				+ "} " + super.toString();
	}
}
