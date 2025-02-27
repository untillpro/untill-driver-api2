package com.untill.driver.interfaces.bills;

public class BillPrintingRequest extends BillsHandlerRequest {
	private String html;

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}
}
