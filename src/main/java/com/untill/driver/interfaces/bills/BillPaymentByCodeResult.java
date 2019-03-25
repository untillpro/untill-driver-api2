package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a result of "Request Payment by Code" action in POS, handled by {@link IBillsHandler}}
 * 
 * @see IBillsHandler
 * @see BillsHandlerRequest
 */
public class BillPaymentByCodeResult extends BillsHandlerResult {

	Long paymentId;
	
	BigDecimal amount;
	
	BigDecimal tip;
	
	String displayText;
	
	List<BillDiscountItem> discountItems = new ArrayList<>();

	/**
	 * @return Returns the list of discount items
	 */
	public List<BillDiscountItem> getDiscountItems() {
		return discountItems;
	}

	/**
	 * Sets the list of discount items
	 * @param discountItems discount items
	 */
	public void setDiscountItems(List<BillDiscountItem> discountItems) {
		this.discountItems = discountItems;
	}

	/**
	 * @return Returns the ID of payment mode
	 */
	public Long getPaymentId() {
		return paymentId;
	}

	/**
	 * Sets the ID of payment mode
	 * @param paymentId Payment Id to set
	 */
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * @return The payment amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * Sets the payment amount
	 * @param amount 
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return The tip amount (optional)
	 */
	public BigDecimal getTip() {
		return tip;
	}

	/**
	 * Sets tip amount (optional)
	 * @param tip
	 */
	public void setTip(BigDecimal tip) {
		this.tip = tip;
	}

	/**
	 * @return Returns the text to display (optional)
	 */
	public String getDisplayText() {
		return displayText;
	}

	/**
	 * Sets the text to display (optional)
	 * @param displayText
	 */
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
	
}
