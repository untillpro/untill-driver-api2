package com.untill.driver.interfaces.bills;

/**
 * Class representing a request for "Bill Close" operation handled by {@link IBillsHandler}}
 * 
 * @see IBillsHandler
 * @see BillsHandlerRequest
 */
public class BillClosingRequest extends BillsHandlerRequest {
	
	private boolean partialBill;

	/**
	 * @return Returns true when the closing bill is a partial, e.g. transaction has or going to have more bills  
	 */
	public boolean isPartialBill() {
		return partialBill;
	}

	/**
	 * Sets the bill partial 
	 * @param partialBill True when the bill is partial, false otherwise
	 */
	public void setPartialBill(boolean partialBill) {
		this.partialBill = partialBill;
	}

}
