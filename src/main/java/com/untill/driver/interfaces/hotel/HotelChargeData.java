package com.untill.driver.interfaces.hotel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hotel charge operation data which includes list of items to be charged, tips,
 * service charge amount, and others
 */

public class HotelChargeData {

	private List<HotelChargeItem> items = new ArrayList<HotelChargeItem>();
	private BigDecimal tips;
	private BigDecimal serviceCharge;
	private BigDecimal openDiscount;
	private String currencyCharCode;
	private String currencyDigitalCode;
	private String waiterOperatorId;
	private String waiterName;
	private Date timestamp;
	private Date billOpenDateTime;
	private String billNumber;
	private String transactionNumber;
	private int salesAreaNumber;
	private String salesAreaName;
	private String salesAreaThirdPartyId;
	private int tableNumber;
	private String tablePart;
	private int numberOfCovers;
	private int servingTimeNumber;
	private String servingTimeName;

	/**
	 * @return Returns number of serving time
	 */
	public int getServingTimeNumber() {
		return servingTimeNumber;
	}

	/**
	 * Sets the number of serving time 
	 * @param servingTimeNumber number of serving time 
	 */
	public void setServingTimeNumber(int servingTimeNumber) {
		this.servingTimeNumber = servingTimeNumber;
	}

	/**
	 * @return Returns name of serving time
	 */
	public String getServingTimeName() {
		return servingTimeName;
	}

	/**
	 * Sets the name of serving time
	 * @param servingTimeName name of serving time
	 */
	public void setServingTimeName(String servingTimeName) {
		this.servingTimeName = servingTimeName;
	}

	/**
	 * @return Returns table number
	 */
	public int getTableNumber() {
		return tableNumber;
	}

	/**
	 * @return Returns an amount of "open discount" which is a discount amount
	 * applied to a bill total
	 */
	public BigDecimal getOpenDiscount() {
		return openDiscount;
	}

	/**
	 * Sets an amount of "open discount" which is a discount amount applied to a
	 * bill total
	 *
	 * @param openDiscount An open discount amount
	 */
	public void setOpenDiscount(BigDecimal openDiscount) {
		this.openDiscount = openDiscount;
	}

	/**
	 * Sets table number
	 *
	 * @param tableNumber table number
	 */
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	/**
	 * @return Returns table part
	 */
	public String getTablePart() {
		return tablePart;
	}

	/**
	 * Sets table part
	 *
	 * @param tablePart Table part
	 */
	public void setTablePart(String tablePart) {
		this.tablePart = tablePart;
	}

	/**
	 * @return Returns number of covers
	 */
	public int getNumberOfCovers() {
		return numberOfCovers;
	}

	/**
	 * Sets number of covers
	 *
	 * @param numberOfCovers Number of covers
	 */
	public void setNumberOfCovers(int numberOfCovers) {
		this.numberOfCovers = numberOfCovers;
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
	 * @param waiterOperatorId Waiter "operator ID" to set
	 */
	public void setWaiterOperatorId(String waiterOperatorId) {
		this.waiterOperatorId = waiterOperatorId;
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
	 * @param currencyCharCode Currency char code to set, for example "EUR"
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
	 * @param currencyDigitalCode Dicital code to set
	 */
	public void setCurrencyDigitalCode(String currencyDigitalCode) {
		this.currencyDigitalCode = currencyDigitalCode;
	}

	/**
	 * @return Returns the list of charged items
	 */
	public List<HotelChargeItem> getItems() {
		return items;
	}

	/**
	 * Sets the list of charged items
	 *
	 * @param items Items to set
	 */
	public void setItems(List<HotelChargeItem> items) {
		this.items = items;
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
	 * @param tips Tips amount tos set
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
	 * @param serviceCharge Service charge amount to set
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
	 * @param waiterName waiter name to set
	 */
	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}

	/**
	 * @return Returns operation timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets operation timestamp
	 *
	 * @param timestamp Timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
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
	 * @param billNumber unTill bill number to set
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
	 * @param transactionNumber unTill transaction number to set
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
	 * @param salesAreaNumber Sales area number to set
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
	 * @param salesAreaName Sales area name
	 */
	public void setSalesAreaName(String salesAreaName) {
		this.salesAreaName = salesAreaName;
	}

	/**
	 * @return Sales area 3rd party ID
	 */
	public String getSalesAreaThirdPartyId() {
		return salesAreaThirdPartyId;
	}

	/**
	 * Set sales area 3rd party ID
	 *
	 * @param salesAreaThirdPartyId Sales area 3rd party ID to set
	 */
	public void setSalesAreaThirdPartyId(String salesAreaThirdPartyId) {
		this.salesAreaThirdPartyId = salesAreaThirdPartyId;
	}

	public Date getBillOpenDateTime() {
		return billOpenDateTime;
	}

	public void setBillOpenDateTime(Date billOpenDateTime) {
		this.billOpenDateTime = billOpenDateTime;
	}

	@Override
	public String toString() {
		return "HotelChargeData{"
				+ "items=" + items
				+ ", tips=" + tips
				+ ", serviceCharge=" + serviceCharge
				+ ", openDiscount=" + openDiscount
				+ ", currencyCharCode='" + currencyCharCode + '\''
				+ ", currencyDigitalCode='" + currencyDigitalCode + '\''
				+ ", waiterOperatorId='" + waiterOperatorId + '\''
				+ ", waiterName='" + waiterName + '\''
				+ ", timestamp=" + timestamp
				+ ", billOpenDateTime=" + billOpenDateTime
				+ ", billNumber='" + billNumber + '\''
				+ ", transactionNumber='" + transactionNumber + '\''
				+ ", salesAreaNumber=" + salesAreaNumber
				+ ", salesAreaName='" + salesAreaName + '\''
				+ ", salesAreaThirdPartyId='" + salesAreaThirdPartyId + '\''
				+ ", tableNumber=" + tableNumber
				+ ", tablePart='" + tablePart + '\''
				+ ", numberOfCovers=" + numberOfCovers
				+ ", servingTimeNumber=" + servingTimeNumber
				+ ", servingTimeName='" + servingTimeName + '\''
				+ '}';
	}
}
