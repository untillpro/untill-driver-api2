package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;

/**
 * Order item data which includes price, description, etc.
 * @see Bill
 */

public class OrderItem {

	private int quantity;
	private boolean menu;
	private BigDecimal singlePrice;
	private BigDecimal singleVatAmount;

	private long departmentId;
	private int departmentNumber;
	private String departmentName;

	private long groupId;
	private int groupNumber;
	private String groupName;

	private BigDecimal vatPercent;
	private String vatSign;

	private long articleId;

	private String articleHqId;
	private int articleNumber;
	private String articleName;
	private BigDecimal discountAmount;
	
	private String signature;

	/**
	 * @return Returns the string which is unique per order item configuration. 
	 * unTill guarantees that if there is any difference between order items (price, course, quantity, options, etc) they've got different signatures.
	 * Only if items are absolutely identical then signature is the same.
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * Sets the signature
	 * @param signature Item signature
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * @return Returns article HQ Id
	 */
	public String getArticleHqId() {
		return articleHqId;
	}

	/**
	 * Sets article HQ Id
	 * @param articleHqId article HQ Id to set
	 */
	public void setArticleHqId(String articleHqId) {
		this.articleHqId = articleHqId;
	}

	/**
	 * @return Returns true if article is a menu
	 */
	public boolean isMenu() {
		return menu;
	}

	/**
	 * Sets if article is a menu or not
	 * @param menu True if article is a menu
	 */
	public void setMenu(boolean menu) {
		this.menu = menu;
	}

	/**
	 * @return Department ID
	 */
	public long getDepartmentId() {
		return departmentId;
	}

	/**
	 * Sets department ID
	 * @param departmentId Department ID
	 */
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return Food Group ID
	 */
	public long getGroupId() {
		return groupId;
	}

	/**
	 * Sets Food Group ID
	 * @param groupId Food Group ID
	 */
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	/**
	 * @return Article ID
	 */
	public long getArticleId() {
		return articleId;
	}

	/**
	 * Sets Article ID
	 * @param articleId Article ID
	 */
	public void setArticleId(long articleId) {
		this.articleId = articleId;
	}

	/**
	 * @return Discount Amount
	 */
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * @param discountAmount Discount Amount to set
	 */
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
	 * @param quantity
	 *            Quantity to set
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
	 * @param singlePrice
	 *            Single price to set
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
	 * @param departmentNumber
	 *            Department number to set
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
	 * @param departmentName
	 *            Department name to set
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
	 * @param groupNumber
	 *            Group number to set
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
	 * @param groupName
	 *            Group name to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
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
	 * @param vatPercent
	 *            V.A.T. percent to set
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
	 * @param vatSign
	 *            V.A.T. sign to set (up to 3 characters)
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
	 * @param articleNumber
	 *            Returns article number to set
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
	 * @param articleName
	 *            Article name to set
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
	 * @param singleVatAmount V.A.T. amount
	 */
	public void setSingleVatAmount(BigDecimal singleVatAmount) {
		this.singleVatAmount = singleVatAmount;
	}

}
