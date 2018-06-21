package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Payment item which includes payment information.
 * @see Bill
 * 
 */

public class PaymentItem {
	private long paymentId;
	private int paymentKind;
	private int paymentNumber;
	private String paymentName;
	private BigDecimal amount;
	private BigDecimal customerAmount;
	private String currencyDigitalCode;
	private String currencyCharCode;
	private Map<String, String> data = new HashMap<>();

	public PaymentItem() {
	}

	public PaymentItem(int paymentKind, String paymentName,
			BigDecimal amount, BigDecimal customerAmount) {
		super();
		this.paymentKind = paymentKind;
		this.paymentName = paymentName;
		this.amount = amount;
		this.customerAmount = customerAmount;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * @return Returns map of data associated with this payment item
	 */
	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
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
	public void setPaymentKind(int paymentKind) {
		this.paymentKind = paymentKind;
	}

	/**
	 * @return Returns name of payment mode, e.g. "Cash", "Visa", etc
	 */
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
