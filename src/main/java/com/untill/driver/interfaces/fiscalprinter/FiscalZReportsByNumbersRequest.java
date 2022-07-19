package com.untill.driver.interfaces.fiscalprinter;

/**
 * Request for "print Z-reports by dates" operation
 */
public class FiscalZReportsByNumbersRequest extends FiscalOperationRequest {

	private int from;

	private int till;
	/**
	 * Report kind
	 */
	private String kind;

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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "FiscalZReportsByNumbersRequest{"
				+ "from=" + from
				+ ", till=" + till
				+ ", kind='" + kind + '\''
				+ '}';
	}
}
