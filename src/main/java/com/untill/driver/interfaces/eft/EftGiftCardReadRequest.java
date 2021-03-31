package com.untill.driver.interfaces.eft;

/**
 * Gift Card Read Request - called when card balance needs to be provided.
 * Driver responds with {@link EftResult} or throws RuntimeException.
 * Current card balance returned in {@link EftResult#getData()} under {@link EftResultFields#CURRENT_BALANCE} key in cents. 
 * @see IEft
 */
public class EftGiftCardReadRequest extends EftRequest {

	private String cardId;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	@Override
	public String toString() {
		return "EftGiftCardReadRequest{"
				+ "cardId='" + cardId + '\''
				+ "} " + super.toString();
	}
}
