package com.untill.driver.untillapi.proformas;

import java.math.BigDecimal;

/**
 * Payment item which includes payment information.
 * @see Proforma
 */

public class PaymentItem {
	private int paymentKind;
	private int paymentNumber;
	private String paymentName;
	private BigDecimal amount;
	private BigDecimal customerAmount;

	private String currencyDigitalCode;
	private String currencyCharCode;

	public PaymentItem() {
	}

	public PaymentItem(int paymentKind, String paymentName, BigDecimal amount, BigDecimal customerAmount) {
		super();
		this.paymentKind = paymentKind;
		this.paymentName = paymentName;
		this.amount = amount;
		this.customerAmount = customerAmount;
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
	 * @see com.untill.driver.PaymentKind
	 */
	public int getPaymentKind() {
		return paymentKind;
	}

	/**
	 * @param paymentKind Sets the paymentKind
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
	 * @see com.untill.driver.PaymentKind
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

	/**
	 * @return Returns ISO 4217 currency char code
	 */
	public String getCurrencyCharCode() {
		return currencyCharCode;
	}

	/**
	 * Sets ISO 4217 currency char code
	 * 
	 * @param currencyCharCode
	 *            Currency char code to set, for example "EUR"
	 */
	public void setCurrencyCharCode(String currencyCharCode) {
		this.currencyCharCode = currencyCharCode;
	}

	/**
	 * @return Returns ISO 4217 currency digital code
	 */
	public String getCurrencyDigitalCode() {
		return currencyDigitalCode;
	}

	/**
	 * Sets ISO 4217 currency digital code
	 * 
	 * @param currencyDigitalCode
	 *            Dicital code to set
	 */
	public void setCurrencyDigitalCode(String currencyDigitalCode) {
		this.currencyDigitalCode = currencyDigitalCode;
	}

	public int getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(int paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

}
