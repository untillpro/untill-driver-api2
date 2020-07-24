package com.untill.driver.interfaces.fiscalprinter;

import java.util.Date;

/**
 * Request for "print Z-reports by dates" operation
 */
public class FiscalZReportsByDatesRequest extends FiscalOperationRequest {

	private Date from;

	private Date till;

	/**
	 * Report kind
	 */
	private String kind;

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTill() {
		return till;
	}

	public void setTill(Date till) {
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
		return "FiscalZReportsByDatesRequest{"
				+ "from=" + from
				+ ", till=" + till
				+ ", kind='" + kind + '\''
				+ '}';
	}
}
