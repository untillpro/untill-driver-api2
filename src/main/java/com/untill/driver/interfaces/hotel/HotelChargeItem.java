package com.untill.driver.interfaces.hotel;

import java.math.BigDecimal;

/**
 * Hotel charge item data: price, description, etc.
 */

public class HotelChargeItem {
	/**
	 * Use totalQuantity when possible. For Menus and Combi-deals, quantity is always 1
	 */
	private int quantity;
	/**
	 * For Menus and Combi-deals, singlePrice is equal to totalPrice
	 */
	private BigDecimal singlePrice;
	private BigDecimal singleVatAmount;
	private BigDecimal discountAmount;

	private int departmentNumber;
	private String departmentName;
	private String departmentThirdPartyId;

	private int groupNumber;
	private String groupName;
	private String groupThirdPartyId;

	private String categoryName;
	private String categoryThirdPartyId;

	private BigDecimal vatPercent;
	private String vatSign;

	private int articleNumber;
	private String articleName;
	private String sizeModifierName;
	/**
	 * The total price of the order item
	 */
	private BigDecimal totalPrice;
	/**
	 * The total quantity of the order item
	 */
	private int totalQuantity;
	/**
	 * The total VAT amount of the order item
	 */
	private BigDecimal totalVatAmount;
	/**
	 * A 3rd party article ID in unTill
	 */
	private String articleThirdPartyId;

	public String getDepartmentThirdPartyId() {
		return departmentThirdPartyId;
	}

	public void setDepartmentThirdPartyId(String departmentThirdPartyId) {
		this.departmentThirdPartyId = departmentThirdPartyId;
	}

	public String getSizeModifierName() {
		return sizeModifierName;
	}

	public void setSizeModifierName(String sizeModifierName) {
		this.sizeModifierName = sizeModifierName;
	}

	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	/**
	 * @return Quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets Quantity
	 *
	 * @param quantity Quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return Single price
	 */
	public BigDecimal getSinglePrice() {
		return singlePrice;
	}

	/**
	 * Sets single price
	 *
	 * @param singlePrice Single price to set
	 */
	public void setSinglePrice(BigDecimal singlePrice) {
		this.singlePrice = singlePrice;
	}

	/**
	 * @return Department number
	 */
	public int getDepartmentNumber() {
		return departmentNumber;
	}

	/**
	 * Sets Department number
	 *
	 * @param departmentNumber Department number to set
	 */
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	/**
	 * @return Department name
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * Sets Department name
	 *
	 * @param departmentName Department name to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return Group number
	 */
	public int getGroupNumber() {
		return groupNumber;
	}

	/**
	 * Sets group number
	 *
	 * @param groupNumber Group number to set
	 */
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	/**
	 * @return Group name
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * Sets Group name
	 *
	 * @param groupName Group name to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * @return Group 3rd party ID
	 */
	public String getGroupThirdPartyId() {
		return groupThirdPartyId;
	}

	/**
	 * Sets group 3rd party ID
	 *
	 * @param groupThirdPartyId group 3rd party ID to set
	 */
	public void setGroupThirdPartyId(String groupThirdPartyId) {
		this.groupThirdPartyId = groupThirdPartyId;
	}

	/**
	 * @return Category name
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Sets category name
	 *
	 * @param categoryName category name to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return Category 3rd party ID
	 */
	public String getCategoryThirdPartyId() {
		return categoryThirdPartyId;
	}

	/**
	 * Sets category 3rd party ID
	 *
	 * @param categoryThirdPartyId category 3rd party ID to set
	 */
	public void setCategoryThirdPartyId(String categoryThirdPartyId) {
		this.categoryThirdPartyId = categoryThirdPartyId;
	}

	/**
	 * @return V.A.T. percent
	 */
	public BigDecimal getVatPercent() {
		return vatPercent;
	}

	/**
	 * Sets V.A.T. percent
	 *
	 * @param vatPercent V.A.T. percent to set
	 */
	public void setVatPercent(BigDecimal vatPercent) {
		this.vatPercent = vatPercent;
	}

	/**
	 * @return V.A.T. sign (up to 3 characters)
	 */
	public String getVatSign() {
		return vatSign;
	}

	/**
	 * Sets V.A.T. sign
	 *
	 * @param vatSign V.A.T. sign to set (up to 3 characters)
	 */
	public void setVatSign(String vatSign) {
		this.vatSign = vatSign;
	}

	/**
	 * @return Article number
	 */
	public int getArticleNumber() {
		return articleNumber;
	}

	/**
	 * Sets article number
	 *
	 * @param articleNumber Returns article number to set
	 */
	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}

	/**
	 * @return Article name
	 */
	public String getArticleName() {
		return articleName;
	}

	/**
	 * Sets Article name
	 *
	 * @param articleName Article name to set
	 */
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	/**
	 * @return Single V.A.T. amount
	 */
	public BigDecimal getSingleVatAmount() {
		return singleVatAmount;
	}

	/**
	 * Sets single V.A.T. amount
	 *
	 * @param singleVatAmount V.A.T. amount
	 */
	public void setSingleVatAmount(BigDecimal singleVatAmount) {
		this.singleVatAmount = singleVatAmount;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public BigDecimal getTotalVatAmount() {
		return totalVatAmount;
	}

	public void setTotalVatAmount(BigDecimal totalVatAmount) {
		this.totalVatAmount = totalVatAmount;
	}

	public String getArticleThirdPartyId() {
		return articleThirdPartyId;
	}

	public void setArticleThirdPartyId(String articleThirdPartyId) {
		this.articleThirdPartyId = articleThirdPartyId;
	}

	@Override
	public String toString() {
		return "HotelChargeItem{"
				+ "quantity=" + quantity
				+ ", singlePrice=" + singlePrice
				+ ", singleVatAmount=" + singleVatAmount
				+ ", discountAmount=" + discountAmount
				+ ", departmentNumber=" + departmentNumber
				+ ", departmentName='" + departmentName + '\''
				+ ", departmentThirdPartyId='" + departmentThirdPartyId + '\''
				+ ", groupNumber=" + groupNumber
				+ ", groupName='" + groupName + '\''
				+ ", groupThirdPartyId='" + groupThirdPartyId + '\''
				+ ", categoryName='" + categoryName + '\''
				+ ", categoryThirdPartyId='" + categoryThirdPartyId + '\''
				+ ", vatPercent=" + vatPercent
				+ ", vatSign='" + vatSign + '\''
				+ ", articleNumber=" + articleNumber
				+ ", articleName='" + articleName + '\''
				+ ", sizeModifierName='" + sizeModifierName + '\''
				+ ", totalPrice=" + totalPrice
				+ ", totalQuantity=" + totalQuantity
				+ ", totalVatAmount=" + totalVatAmount
				+ ", articleThirdPartyId='" + articleThirdPartyId + '\''
				+ '}';
	}
}
