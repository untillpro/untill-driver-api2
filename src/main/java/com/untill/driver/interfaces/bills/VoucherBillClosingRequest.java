package com.untill.driver.interfaces.bills;

import com.untill.driver.interfaces.cash.ICashHandler;

import java.math.BigDecimal;

/**
 * A request for {@link ICustomBillsHandler} <tt>purchase voucher</tt> operation
 */
public class VoucherBillClosingRequest extends CustomBillsHandlerRequest {

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
