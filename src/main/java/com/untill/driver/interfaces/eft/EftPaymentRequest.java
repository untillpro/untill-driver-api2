package com.untill.driver.interfaces.eft;

import java.math.BigDecimal;

/**
 * Represents request for EFT Sale operation
 *
 * @see			IEft
 * @see			EftRequest
 * @see			EftTransactionRequest
 */
public class EftPaymentRequest extends EftTransactionRequest {

	private BigDecimal vat;

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

}
