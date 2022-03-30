package com.untill.driver.interfaces.eft;

/**
 * Gift Card Validate Request - called before issue or reload operations.
 * Driver responds with {@link EftResult} or throws {@link java.lang.RuntimeException} when gift card with provided
 * <tt>cardId</tt> is not valid. The result of this operation is ignored by unTill.
 *
 * @see IEft
 */
public class EftGiftCardValidateRequest extends EftRequest {

	private String cardId;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	@Override
	public String toString() {
		return "EftGiftCardValidateRequest{"
				+ "cardId='" + cardId + '\''
				+ "} " + super.toString();
	}
}
