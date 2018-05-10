package com.untill.driver.interfaces.eft;

import java.math.BigDecimal;

/**
 * Represents request for "Pre-auth completion" EFT operation
 *
 * @see			IEft
 * @see			EftRequest
 * @see			EftModifyTransactionRequest
 */
public class EftCompletionRequest extends EftModifyTransactionRequest {

	private BigDecimal amount;

	public EftCompletionRequest() {
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
