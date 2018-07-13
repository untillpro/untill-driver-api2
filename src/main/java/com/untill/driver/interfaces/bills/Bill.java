package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Bill data
 * 
 */
public class Bill {

	private int tableNumber;
	private String tablePart;
	private Date openTime;
	private int salesAreaNumber;
	private String salesAreaName;
	private String waiterName;
	private String waiterOperatorId;
	private String billNumber;
	private long transactionId;
	private String transactionNumber;
	private int numberOfCovers;
	private BigDecimal tips;
	private BigDecimal serviceCharge;
	private BigDecimal openDiscount;
	private List<OrderItem> orderItems = new ArrayList<>();
	private List<PaymentItem> paymentItems = new ArrayList<>();
	private List<DiscountGroup> appliedDiscountGroups = new ArrayList<>();
	private Map<String, String> extra = new LinkedHashMap<>();
	/**
	 * @return Returns number of covers
	 */
	public int getNumberOfCovers() {
		return numberOfCovers;
	}

	/**
	 * Sets number of covers
	 * @param numberOfCovers Number of covers
	 */
	public void setNumberOfCovers(int numberOfCovers) {
		this.numberOfCovers = numberOfCovers;
	}

	/**
	 * @return Returns extra information. See {@link BillExtra} for the list of keys
	 */
	public Map<String, String> getExtra() {
		return extra;
	}

	/**
	 * Sets extra information. See also {@link BillExtra} for the list of keys
	 * @param extra Extra information to set
	 * @see BillExtra
	 */
	public void setExtra(Map<String, String> extra) {
		this.extra = extra;
	}

	/**
	 * @return Returns the list of discount groups applied to the bill
	 * @see DiscountGroup
	 */
	public List<DiscountGroup> getAppliedDiscountGroups() {
		return appliedDiscountGroups;
	}

	/**
	 * Sets the list of discount groups applied to the bill
	 * @param appliedDiscountGroups List of discount groups to set
	 * @see DiscountGroup
	 */
	public void setAppliedDiscountGroups(List<DiscountGroup> appliedDiscountGroups) {
		this.appliedDiscountGroups = appliedDiscountGroups;
	}

	/**
	 * @return Transaction ID
	 */
	public long getTransactionId() {
		return transactionId;
	}

	/**
	 * Sets Transaction ID
	 * @param id ID to set
	 */
	public void setTransactionId(long id) {
		this.transactionId = id;
	}

	/**
	 * @return Table number
	 */
	public int getTableNumber() {
		return tableNumber;
	}

	/**
	 * Sets table number
	 * @param tableNumber Table number to set
	 */
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	/**
	 * @return table part
	 */
	public String getTablePart() {
		return tablePart;
	}

	/**
	 * Sets table part
	 * @param tablePart Table part to set
	 */
	public void setTablePart(String tablePart) {
		this.tablePart = tablePart;
	}

	/**
	 * @return order items
	 */
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	/**
	 * Sets order items
	 * @param orderItems Order items to set
	 */
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	/**
	 * @return Payment items
	 */
	public List<PaymentItem> getPaymentItems() {
		return paymentItems;
	}

	/**
	 * Sets payment items
	 * @param paymentItems Payment items to set
	 */
	public void setPaymentItems(List<PaymentItem> paymentItems) {
		this.paymentItems = paymentItems;
	}

	/**
	 * @return Returns waiter "operator ID" which is unique per waiter
	 */
	public String getWaiterOperatorId() {
		return waiterOperatorId;
	}

	/**
	 * Sets waiter "operator ID" which is unique per waiter
	 * 
	 * @param waiterOperatorId
	 *            Waiter "operator ID" to set
	 */
	public void setWaiterOperatorId(String waiterOperatorId) {
		this.waiterOperatorId = waiterOperatorId;
	}

	/**
	 * @return Returns tips amount
	 */
	public BigDecimal getTips() {
		return tips;
	}

	/**
	 * Sets tips amount
	 * 
	 * @param tips
	 *            Tips amount tos set
	 */
	public void setTips(BigDecimal tips) {
		this.tips = tips;
	}

	/**
	 * @return Returns service charge amount
	 */
	public BigDecimal getServiceCharge() {
		return serviceCharge;
	}

	/**
	 * Sets service charge amount
	 * 
	 * @param serviceCharge
	 *            Service charge amount to set
	 */
	public void setServiceCharge(BigDecimal serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	/**
	 * @return Returns waiter name
	 */
	public String getWaiterName() {
		return waiterName;
	}

	/**
	 * Sets waiter name
	 * 
	 * @param waiterName
	 *            waiter name to set
	 */
	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}


	/**
	 * @return Returns unTill bill number
	 */
	public String getBillNumber() {
		return billNumber;
	}

	/**
	 * Sets unTill bill number
	 * 
	 * @param billNumber
	 *            unTill bill number to set
	 */
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	/**
	 * @return Returns unTill transaction number
	 */
	public String getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * Sets unTill transaction number
	 * 
	 * @param transactionNumber
	 *            unTill transaction number to set
	 */
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	/**
	 * @return Returns sales area number
	 */
	public int getSalesAreaNumber() {
		return salesAreaNumber;
	}

	/**
	 * Sets sales area number
	 * 
	 * @param salesAreaNumber
	 *            Sales area number to set
	 */
	public void setSalesAreaNumber(int salesAreaNumber) {
		this.salesAreaNumber = salesAreaNumber;
	}

	/**
	 * @return Returns sales area number
	 */
	public String getSalesAreaName() {
		return salesAreaName;
	}

	/**
	 * Sets sales area number
	 * 
	 * @param salesAreaName
	 */
	public void setSalesAreaName(String salesAreaName) {
		this.salesAreaName = salesAreaName;
	}

	/**
	 * @return Date and time when bill was created
	 */
	public Date getOpenTime() {
		return openTime;
	}

	/**
	 * Sets date and time when bill was created
	 * @param openTime date and time when bill was created
	 */
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	/**
	 * @return Returns an amount of "open discount" which is a discount amount applied to a bill total
	 */
	public BigDecimal getOpenDiscount() {
		return openDiscount;
	}

	/**
	 * Sets an amount of "open discount" which is a discount amount applied to a bill total
	 * @param openDiscount An open discount amount
	 */
	public void setOpenDiscount(BigDecimal openDiscount) {
		this.openDiscount = openDiscount;
	}

}