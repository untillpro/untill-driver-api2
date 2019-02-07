package com.untill.driver.interfaces.fiscalprinter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Describes the fiscal document (bill), including items and payments
 * 
 * @see FiscalItem
 * @see FiscalPayment
 * @see IFiscalPrinter
 */
public class FiscalDocument {
	private Date timestamp;
	private String branchName;
	private String waiterTerminalId;
	private String waiterName;
	private int tableNumber;
	private String tablePart;
	private int billNo;
	private String billPrefix;
	private int failuredBillNo;
	private int tranNo;
	private String tranPrefix;
	private int failuredTranNo;
	private int fiscalBillNumber;
	private int reopenedFiscalBillNumber;
	private boolean businessUse;

	private BigDecimal discount;
	private BigDecimal discountPercent;
	private String discountDescription;
	private BigDecimal serviceCharge;
	private BigDecimal serviceChargePercent;
	private String serviceChargeDescription;
	private String customerName;
	private int customerNumber;
	private boolean customerExempted;
	private String customerTaxId;
	private List<FiscalItem> items;
	private List<FiscalPayment> payments;
	private String comments;
	private String pcName;

	public String getPcName() {
		return pcName;
	}

	public void setPcName(String pcName) {
		this.pcName = pcName;
	}

	public FiscalDocument() {
	}

	@Override
	public String toString() {
		return "FiscalDocument [timestamp=" + timestamp + ", branchName=" + branchName + ", waiterTerminalId="
				+ waiterTerminalId + ", waiterName=" + waiterName + ", tableNumber=" + tableNumber + ", tablePart="
				+ tablePart + ", billNo=" + billNo + ", billPrefix=" + billPrefix + ", failuredBillNo=" + failuredBillNo
				+ ", tranNo=" + tranNo + ", tranPrefix=" + tranPrefix + ", failuredTranNo=" + failuredTranNo
				+ ", fiscalBillNumber=" + fiscalBillNumber + ", reopenedFiscalBillNumber=" + reopenedFiscalBillNumber
				+ ", businessUse=" + businessUse + ", discount=" + discount + ", discountPercent=" + discountPercent
				+ ", discountDescription=" + discountDescription + ", serviceCharge=" + serviceCharge
				+ ", serviceChargePercent=" + serviceChargePercent + ", serviceChargeDescription="
				+ serviceChargeDescription + ", customerName=" + customerName + ", customerNumber=" + customerNumber
				+ ", customerExempted=" + customerExempted + ", customerTaxId=" + customerTaxId + ", items=" + items
				+ ", payments=" + payments + ", comments=" + comments + ", pcName=" + pcName + "]";
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getWaiterTerminalId() {
		return waiterTerminalId;
	}

	public void setWaiterTerminalId(String waiterTerminalId) {
		this.waiterTerminalId = waiterTerminalId;
	}

	public String getWaiterName() {
		return waiterName;
	}

	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getTablePart() {
		return tablePart;
	}

	public void setTablePart(String tablePart) {
		this.tablePart = tablePart;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public String getBillPrefix() {
		return billPrefix;
	}

	public void setBillPrefix(String billPrefix) {
		this.billPrefix = billPrefix;
	}

	public int getFailuredBillNo() {
		return failuredBillNo;
	}

	public void setFailuredBillNo(int failuredBillNo) {
		this.failuredBillNo = failuredBillNo;
	}

	public int getTranNo() {
		return tranNo;
	}

	public void setTranNo(int tranNo) {
		this.tranNo = tranNo;
	}

	public String getTranPrefix() {
		return tranPrefix;
	}

	public void setTranPrefix(String tranPrefix) {
		this.tranPrefix = tranPrefix;
	}

	public int getFailuredTranNo() {
		return failuredTranNo;
	}

	public void setFailuredTranNo(int failuredTranNo) {
		this.failuredTranNo = failuredTranNo;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(BigDecimal discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getDiscountDescription() {
		return discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	public BigDecimal getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(BigDecimal serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public BigDecimal getServiceChargePercent() {
		return serviceChargePercent;
	}

	public void setServiceChargePercent(BigDecimal serviceChargePercent) {
		this.serviceChargePercent = serviceChargePercent;
	}

	public String getServiceChargeDescription() {
		return serviceChargeDescription;
	}

	public void setServiceChargeDescription(String serviceChargeDescription) {
		this.serviceChargeDescription = serviceChargeDescription;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerTaxId() {
		return customerTaxId;
	}

	public void setCustomerTaxId(String customerTaxId) {
		this.customerTaxId = customerTaxId;
	}

	public List<FiscalItem> getItems() {
		return items;
	}

	public void setItems(List<FiscalItem> items) {
		this.items = items;
	}

	public List<FiscalPayment> getPayments() {
		return payments;
	}

	public void setPayments(List<FiscalPayment> payments) {
		this.payments = payments;
	}

	public int getFiscalBillNumber() {
		return fiscalBillNumber;
	}

	public void setFiscalBillNumber(int fiscalBillNumber) {
		this.fiscalBillNumber = fiscalBillNumber;
	}

	public int getReopenedFiscalBillNumber() {
		return reopenedFiscalBillNumber;
	}

	public void setReopenedFiscalBillNumber(int reopenedFiscalBillNumber) {
		this.reopenedFiscalBillNumber = reopenedFiscalBillNumber;
	}

	public boolean isCustomerExempted() {
		return customerExempted;
	}

	public void setCustomerExempted(boolean customerExempted) {
		this.customerExempted = customerExempted;
	}

	/**
	 * @return Returns true if the document created for a company/business.
	 */
	public boolean isBusinessUse() {
		return businessUse;
	}

	/**
	 * Specify if the document created for company/business or for personal
	 * customer.
	 * 
	 * @param businessUse
	 *            - True if document is for company/business
	 */
	public void setBusinessUse(boolean businessUse) {
		this.businessUse = businessUse;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
