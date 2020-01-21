package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;

public class Voucher {
	/**
	 * Voucher identifier
	 */
	private String voucherId;
	/**
	 * Voucher amount
	 */
	private BigDecimal amount;
	/**
	 * Payment kind
	 */
	private Integer paymentKind;

	public String getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getPaymentKind() {
		return paymentKind;
	}

	public void setPaymentKind(Integer paymentKind) {
		this.paymentKind = paymentKind;
	}
}
