package com.untill.driver.interfaces.fiscalprinter;

/**
 * Defines z-report print operation result
 * 
 */
public class FiscalZReportResult extends FiscalPrinterResult {

	private String zReportNumber;

	public FiscalZReportResult() {
	}

	public FiscalZReportResult(String zReportNumber) {
		super();
		this.zReportNumber = zReportNumber;
	}

	public String getzReportNumber() {
		return zReportNumber;
	}

	public void setzReportNumber(String zReportNumber) {
		this.zReportNumber = zReportNumber;
	}

	@Override
	public String toString() {
		return "ZReportResult [zReportNumber=" + ((zReportNumber != null) ? zReportNumber : "null") + "]";
	}

}
