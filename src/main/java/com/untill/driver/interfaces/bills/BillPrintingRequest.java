package com.untill.driver.interfaces.bills;

public class BillPrintingRequest extends BillsHandlerRequest {
	private String html;
	private boolean billCopy;

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public boolean isBillCopy() {
		return billCopy;
	}

	public void setBillCopy(boolean billCopy) {
		this.billCopy = billCopy;
	}
}
