package com.untill.driver.untillapi.proformas;

import java.math.BigDecimal;

/**
 * Proforma data
 *
 * @see IUntillProformasApi
 */
public class Proforma {

	private Long id;

	private String signature;

	private int tableNo;

	private String tablePart;

	private Long billCloseDate;

	private ProformaExtraData extraData;

	private Long userId;
	/**
	 * Amount that can be paid
	 */
	private BigDecimal amount;
	private Long transactionId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public ProformaExtraData getExtraData() {
		return extraData;
	}

	public void setExtraData(ProformaExtraData extraData) {
		this.extraData = extraData;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public int getTableNo() {
		return tableNo;
	}

	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}

	public String getTablePart() {
		return tablePart;
	}

	public void setTablePart(String tablePart) {
		this.tablePart = tablePart;
	}

	public Long getBillCloseDate() {
		return billCloseDate;
	}

	public void setBillCloseDate(Long billCloseDate) {
		this.billCloseDate = billCloseDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
}
