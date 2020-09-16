package com.untill.driver.interfaces.eft;

import java.math.BigDecimal;

/**
 * Represents request for EFT Sale operation
 *
 * @see IEft
 * @see EftRequest
 * @see EftTransactionRequest
 */
public class EftPaymentRequest extends EftTransactionRequest {

	private BigDecimal vat;

	/**
	 * Indicates the part of total amount which will be returned to customer in Cash.
	 * Can be ignored when not supported by integration.
	 */
	private BigDecimal cashout;
	/**
	 * Indicates that partial authorization allowed for this request.
	 * Can be ignored when not supported by integration
	 */
	private boolean allowPartialAuth;

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public BigDecimal getCashout() {
		return cashout;
	}

	public void setCashout(BigDecimal cashout) {
		this.cashout = cashout;
	}

	public boolean isAllowPartialAuth() {
		return allowPartialAuth;
	}

	public void setAllowPartialAuth(boolean allowPartialAuth) {
		this.allowPartialAuth = allowPartialAuth;
	}
}
