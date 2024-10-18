package com.untill.driver.interfaces.eft;

/**
 * Gift Card Validate Request - called before issue or reload operations.
 * Driver responds with {@link EftResult} or throws {@link java.lang.RuntimeException} when gift card with provided
 * <tt>cardId</tt> is not valid. The result of this operation is ignored by unTill.
 *
 * @see IEft
 */
public class EftGiftCardValidateRequest extends EftRequest {
	public static final String REASON_ISSUE = "issue";
	public static final String REASON_RELOAD = "reload";
	private String cardId;
	private String reason;
	/**
	 * Specifies the amount the card is issued or reloaded with
	 */
	private Boolean amount;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Boolean getAmount() {
		return amount;
	}

	public void setAmount(Boolean amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "EftGiftCardValidateRequest{"
				+ "cardId='" + cardId + '\''
				+ ", reason='" + reason + '\''
				+ ", amount=" + amount
				+ "} " + super.toString();
	}
}
