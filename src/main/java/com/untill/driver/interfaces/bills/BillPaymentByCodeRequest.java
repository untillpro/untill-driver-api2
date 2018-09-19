package com.untill.driver.interfaces.bills;

/**
 * Class representing a request for "Request Payment by Code" action in POS, handled by {@link IBillsHandler}}
 * 
 * @see IBillsHandler
 * @see BillsHandlerRequest
 */
public class BillPaymentByCodeRequest extends BillsHandlerRequest {

	String code;
	
	String splitInfo;

	/**
	 * @return Returns the code which was typed or scanned in POS when user executed "Request Payment by Code" action in POS
	 */
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return Returns non-null when bill was splitted
	 */
	public String getSplitInfo() {
		return splitInfo;
	}

	public void setSplitInfo(String splitInfo) {
		this.splitInfo = splitInfo;
	}
	
}
