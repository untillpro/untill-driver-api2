package com.untill.driver.untillapi.proformas;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Proforma payment data
 * @see Proforma
 *
 */
public class ProformaPayment {

	private BigDecimal amount;

	private BigDecimal tip;

	private Long paymentId;

	private Map<String, String> dataFields = new HashMap<String, String>();

	public Map<String, String> getDataFields() {
		return dataFields;
	}

	public void setDataFields(Map<String, String> dataFields) {
		this.dataFields = dataFields;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTip() {
		return tip;
	}

	public void setTip(BigDecimal tip) {
		this.tip = tip;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

}
