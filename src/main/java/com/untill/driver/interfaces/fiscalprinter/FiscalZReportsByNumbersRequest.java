package com.untill.driver.interfaces.fiscalprinter;

/**
 * Request for "print Z-reports by dates" operation
 */
public class FiscalZReportsByNumbersRequest extends FiscalOperationRequest {

	private int from;

	private int till;

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTill() {
		return till;
	}

	public void setTill(int till) {
		this.till = till;
	}

	@Override
	public String toString() {
		return "FiscalZReportsByNumbersRequest{"
				+ "from=" + from
				+ ", till=" + till
				+ '}';
	}
}
