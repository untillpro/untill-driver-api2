package com.untill.driver.interfaces.fiscalprinter;

/**
 * Defines z-report print operation request
 */
public class FiscalZReportRequest extends FiscalPrinterRequest {

	private boolean printed;

	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean printed) {
		this.printed = printed;
	}

	@Override
	public String toString() {
		return "FiscalZReportRequest{"
				+ "printed=" + printed
				+ '}';
	}
}
