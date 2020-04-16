package com.untill.driver.interfaces.eft;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Baic class for {@link IEft} transaction requests
 * @see			IEft
 * @see			EftRequest
 *
 */
public abstract class EftTransactionRequest extends EftRequest {

	private BigDecimal amount;
	private String currencyCode;
	private String currencyCharCode;
	private Date timestamp;
	private int billNumber;
	private String orderId;
	private String transactionId;
	private boolean manualEntry;

	public EftTransactionRequest() {
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return Returns the receipt number which is unique per database
	 */
	public int getBillNumber() {
		return billNumber;
	}

	/**
	 * Sets the receipt number which is unique per database
	 * @param billNumber Bill number
	 */
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	/**
	 * @return Returns the receipt ID which is unique per all synced databases in location
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * Sets the receipt ID which is unique per all synced databases in location
	 * @param orderId Order Id
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public boolean isManualEntry() {
		return manualEntry;
	}

	public void setManualEntry(boolean manualEntry) {
		this.manualEntry = manualEntry;
	}

	public String getCurrencyCharCode() {
		return currencyCharCode;
	}

	public void setCurrencyCharCode(String currencyCharCode) {
		this.currencyCharCode = currencyCharCode;
	}

}
