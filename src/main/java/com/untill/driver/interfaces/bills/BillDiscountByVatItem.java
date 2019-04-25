package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;

public class BillDiscountByVatItem extends BillDiscountItem {

	private BigDecimal vatPercent;

	private String vatSign;
	
	private String discountKey;
	
	private String discountTitle;
	
	private String discountDescription;	
	
	public String getDiscountDescription() {
		return discountDescription;
	}

	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	public String getDiscountKey() {
		return discountKey;
	}

	public void setDiscountKey(String discountKey) {
		this.discountKey = discountKey;
	}

	public String getDiscountTitle() {
		return discountTitle;
	}

	public void setDiscountTitle(String discountTitle) {
		this.discountTitle = discountTitle;
	}

	public BigDecimal getVatPercent() {
		return vatPercent;
	}

	public void setVatPercent(BigDecimal vatPercent) {
		this.vatPercent = vatPercent;
	}

	public String getVatSign() {
		return vatSign;
	}

	public void setVatSign(String vatSign) {
		this.vatSign = vatSign;
	}


}
