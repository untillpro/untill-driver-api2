package com.untill.driver.interfaces.bills;

import com.untill.driver.interfaces.prepaidarticles.PrepaidItem;

import java.math.BigDecimal;

/**
 * Order item data which includes price, description, etc.
 *
 * @see Bill
 */

public class OrderItem {
	/**
	 * Use totalQuantity when possible. For Menus and Combi-deals, quantity is always 1
	 */
	private int quantity;
	private boolean menu;
	/**
	 * For Menus and Combi-deals, singlePrice is equal to totalPrice
	 */
	private BigDecimal singlePrice;
	private BigDecimal singleVatAmount;

	private long departmentId;
	private int departmentNumber;
	private String departmentName;
	private String departmentThirdPartyId;

	private long groupId;
	private int groupNumber;
	private String groupName;
	private String groupThirdPartyId;
	private String categoryName;
	private String categoryThirdPartyId;

	private BigDecimal vatPercent;
	private String vatSign;

	private long articleId;
	private long sizeModifierId;
	private String sizeModifierName;

	private String articleHqId;
	private int articleNumber;
	private String articleName;
	private BigDecimal discountAmount;
	private String discountDescription;

	private boolean discountAllowed;
	private String signature;
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
	/**
	 * An ID of the {@link PrepaidItem#itemId prepaid item}
	 */
	private String prepaidItemId;

	public String getSizeModifierName() {
		return sizeModifierName;
	}

	public void setSizeModifierName(String sizeModifierName) {
		this.sizeModifierName = sizeModifierName;
	}

	public long getSizeModifierId() {
		return sizeModifierId;
	}

	public void setSizeModifierId(long sizeModifierId) {
		this.sizeModifierId = sizeModifierId;
	}

	public String getDiscountDescription() {
		return discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	/**
	 * @return True if discount is allowed for this item
	 */
	public boolean isDiscountAllowed() {
		return discountAllowed;
	}

	/**
	 * Specifies if the discount is allowed for this item
	 *
	 * @param discountAllowed True when discount is allowed
	 */
	public void setDiscountAllowed(boolean discountAllowed) {
		this.discountAllowed = discountAllowed;
	}

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
	 *
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
	 *
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
	 *
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
	 *
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
	 *
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
	 *
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
	 * @return Department 3rd party ID
	 */
	public String getDepartmentThirdPartyId() {
		return departmentThirdPartyId;
	}

	/**
	 * Set department 3rd party ID
	 *
	 * @param departmentThirdPartyId Department 3rd party ID to set
	 */
	public void setDepartmentThirdPartyId(String departmentThirdPartyId) {
		this.departmentThirdPartyId = departmentThirdPartyId;
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

	/**
	 * @return Category name
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * Sets category name
	 *
	 * @param categoryName Category name to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public String getPrepaidItemId() {
		return prepaidItemId;
	}

	public void setPrepaidItemId(String prepaidItemId) {
		this.prepaidItemId = prepaidItemId;
	}

	@Override
	public String toString() {
		return "OrderItem{"
				+ "quantity=" + quantity
				+ ", menu=" + menu
				+ ", singlePrice=" + singlePrice
				+ ", singleVatAmount=" + singleVatAmount
				+ ", departmentId=" + departmentId
				+ ", departmentNumber=" + departmentNumber
				+ ", departmentName='" + departmentName + '\''
				+ ", departmentThirdPartyId='" + departmentThirdPartyId + '\''
				+ ", groupId=" + groupId
				+ ", groupNumber=" + groupNumber
				+ ", groupName='" + groupName + '\''
				+ ", groupThirdPartyId='" + groupThirdPartyId + '\''
				+ ", categoryName='" + categoryName + '\''
				+ ", categoryThirdPartyId='" + categoryThirdPartyId + '\''
				+ ", vatPercent=" + vatPercent
				+ ", vatSign='" + vatSign + '\''
				+ ", articleId=" + articleId
				+ ", sizeModifierId=" + sizeModifierId
				+ ", sizeModifierName='" + sizeModifierName + '\''
				+ ", articleHqId='" + articleHqId + '\''
				+ ", articleNumber=" + articleNumber
				+ ", articleName='" + articleName + '\''
				+ ", discountAmount=" + discountAmount
				+ ", discountDescription='" + discountDescription + '\''
				+ ", discountAllowed=" + discountAllowed
				+ ", signature='" + signature + '\''
				+ ", totalPrice=" + totalPrice
				+ ", totalQuantity=" + totalQuantity
				+ ", totalVatAmount=" + totalVatAmount
				+ ", articleThirdPartyId='" + articleThirdPartyId + '\''
				+ ", prepaidItemId='" + prepaidItemId + '\''
				+ '}';
	}
}
