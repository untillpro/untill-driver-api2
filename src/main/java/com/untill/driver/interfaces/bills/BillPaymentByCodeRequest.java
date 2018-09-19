package com.untill.driver.interfaces.bills;

/**
 * Class representing a request for "Request Payment by Code" action in POS, handled by {@link IBillsHandler}}
 * 
 * @see IBillsHandler
 * @see BillsHandlerRequest
 */
public class BillPaymentByCodeRequest extends BillsHandlerRequest {

	String code;
	
	private boolean billSplit;

	/**
	 * @return Returns true if bill was splitted
	 */
	public boolean isBillSplit() {
		return billSplit;
	}

	public void setBillSplit(boolean billSplit) {
		this.billSplit = billSplit;
	}


	/**
	 * @return Returns the code which was typed or scanned in POS when user executed "Request Payment by Code" action in POS
	 */
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
