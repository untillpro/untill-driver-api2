package com.untill.driver.interfaces.eft;

import java.math.BigDecimal;

/**
 * Represents request for "Tips request" {@link IEft} operation
 *
 * @see			IEft
 * @see			EftRequest
 * @see			EftModifyTransactionRequest
 */
public class EftTipsRequest extends EftModifyTransactionRequest {

	private BigDecimal tips;

	public BigDecimal getTips() {
		return tips;
	}

	public void setTips(BigDecimal tips) {
		this.tips = tips;
	}

}
