package com.untill.driver.interfaces.eft;

import java.util.Date;

public abstract class EftGiftCardTransactionRequest extends EftRequest {

	private String cardId;
	
	private String operationId;

	private Date timestamp;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	@Override
	public String toString() {
		return "EftGiftCardTransactionRequest{"
				+ "cardId='" + cardId + '\''
				+ ", operationId='" + operationId + '\''
				+ ", timestamp=" + timestamp
				+ "} " + super.toString();
	}
}
