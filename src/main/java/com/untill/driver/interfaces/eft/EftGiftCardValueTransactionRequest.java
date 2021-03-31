package com.untill.driver.interfaces.eft;

import java.math.BigDecimal;

public abstract class EftGiftCardValueTransactionRequest extends EftGiftCardTransactionRequest {

	private BigDecimal amount;

	private String currencyCode;
	
	private String currencyCharCode;
	
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCharCode() {
		return currencyCharCode;
	}

	public void setCurrencyCharCode(String currencyCharCode) {
		this.currencyCharCode = currencyCharCode;
	}

	@Override
	public String toString() {
		return "EftGiftCardValueTransactionRequest{"
				+ "amount=" + amount
				+ ", currencyCode='" + currencyCode + '\''
				+ ", currencyCharCode='" + currencyCharCode + '\''
				+ "} " + super.toString();
	}
}
