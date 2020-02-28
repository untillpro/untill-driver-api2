package com.untill.driver.interfaces.fiscalprinter;

import java.math.BigDecimal;

/**
 * FiscalPayment is a part of {@link FiscalDocument} describing bill payment item
 */

public class FiscalPayment {

	private int paymentKind;
	private int paymentNumber;
	private String paymentName;
	private BigDecimal amount;
	private BigDecimal customerAmount;
	private BigDecimal returnAmount;

	public FiscalPayment() {
	}

	public FiscalPayment(int paymentKind, String paymentName, BigDecimal amount, BigDecimal customerAmount,
	                     BigDecimal returnAmount) {
		super();
		this.paymentKind = paymentKind;
		this.paymentName = paymentName;
		this.amount = amount;
		this.customerAmount = customerAmount;
		this.returnAmount = returnAmount;
	}

	/**
	 * @return Returns payment kind
	 * <ul>
	 * <li>PAYMENT_CASH = 0;</li>
	 * <li>PAYMENT_CARD = 1;</li>
	 * <li>PAYMENT_ACCOUNT = 2;</li>
	 * <li>PAYMENT_ROOM = 3;</li>
	 * <li>PAYMENT_CHEQUE = 4;</li>
	 * <li>PAYMENT_HASH = 5;</li>
	 * <li>PAYMENT_DISCOUNT = 7;</li>
	 * <li>PAYMENT_SMARTCARD = 8;</li>
	 * <li>PAYMENT_CASHDRO = 9;</li>
	 * <li>PAYMENT_NEWYSE_ONACCOUNT = 10;</li>
	 * <li>PAYMENT_GIFT_CARD = 11;</li>
	 * </ul>
	 */
	public int getPaymentKind() {
		return paymentKind;
	}

	/**
	 * @param paymentKind Sets the paymentKind
	 *                    <ul>
	 *                    <li>PAYMENT_CASH = 0;</li>
	 *                    <li>PAYMENT_CARD = 1;</li>
	 *                    <li>PAYMENT_ACCOUNT = 2;</li>
	 *                    <li>PAYMENT_ROOM = 3;</li>
	 *                    <li>PAYMENT_CHEQUE = 4;</li>
	 *                    <li>PAYMENT_HASH = 5;</li>
	 *                    <li>PAYMENT_DISCOUNT = 7;</li>
	 *                    <li>PAYMENT_SMARTCARD = 8;</li>
	 *                    <li>PAYMENT_CASHDRO = 9;</li>
	 *                    <li>PAYMENT_NEWYSE_ONACCOUNT = 10;</li>
	 *                    <li>PAYMENT_GIFT_CARD = 11;</li>
	 *                    </ul>
	 */
	public void setPaymentKind(int paymentKind) {
		this.paymentKind = paymentKind;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCustomerAmount() {
		return customerAmount;
	}

	public void setCustomerAmount(BigDecimal customerAmount) {
		this.customerAmount = customerAmount;
	}

	public BigDecimal getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}

	public int getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(int paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	@Override
	public String toString() {
		return "FiscalPayment{"
				+ "paymentKind=" + paymentKind
				+ ", paymentNumber=" + paymentNumber
				+ ", paymentName='" + paymentName + '\''
				+ ", amount=" + amount
				+ ", customerAmount=" + customerAmount
				+ ", returnAmount=" + returnAmount
				+ '}';
	}
}
