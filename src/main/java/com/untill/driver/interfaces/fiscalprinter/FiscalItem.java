package com.untill.driver.interfaces.fiscalprinter;

import java.math.BigDecimal;

/**
 * Represents single fiscal {@link FiscalDocument} item
 * 
 * @see FiscalDocument
 */
public class FiscalItem {
	private int articleNumber;
	private String articleName;
	private String sizeModifierName;
	private int departmentNumber;
	private String departmentName;
	private int courseNumber;
	private String courseName;
	private int groupNumber;
	private String groupName;
	private int categoryNumber;
	private String categoryName;
	private int quantity;
	private String unit;
	private BigDecimal price;
	private BigDecimal discount;
	private BigDecimal discountPercent;
	private BigDecimal vat;
	private BigDecimal vatPercent;
	private BigDecimal purcharsePrice;
	private String vatSign;
	private boolean surcharge;
	private int itemType; // article, option, etc

	public FiscalItem() {
	}

	public String getSizeModifierName() {
		return sizeModifierName;
	}

	public void setSizeModifierName(String sizeModifierName) {
		this.sizeModifierName = sizeModifierName;
	}

	public int getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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

	public BigDecimal getVat() {
		return vat;
	}

	public void setVat(BigDecimal vat) {
		this.vat = vat;
	}

	public BigDecimal getVatPercent() {
		return vatPercent;
	}

	public void setVatPercent(BigDecimal vatPercent) {
		this.vatPercent = vatPercent;
	}

	public BigDecimal getPurcharsePrice() {
		return purcharsePrice;
	}

	public void setPurcharsePrice(BigDecimal purcharsePrice) {
		this.purcharsePrice = purcharsePrice;
	}

	public String getVatSign() {
		return vatSign;
	}

	public void setVatSign(String vatSign) {
		this.vatSign = vatSign;
	}

	public int getItemType() {
		return itemType;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	public int getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(int categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public boolean isSurcharge() {
		return surcharge;
	}

	public void setSurcharge(boolean surcharge) {
		this.surcharge = surcharge;
	}

}
