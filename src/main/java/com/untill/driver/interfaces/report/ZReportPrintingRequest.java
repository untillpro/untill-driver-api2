package com.untill.driver.interfaces.report;

import java.util.Date;

/**
 * A request for {@link IReportHandler} <tt>z-report printed</tt> operation
 */
public class ZReportPrintingRequest extends ReportHandlerRequest {
	/**
	 * Z-report number
	 */
	private int number;
	/**
	 * Z-report from timestamp
	 */
	private Date from;
	/**
	 * Z-report till timestamp
	 */
	private Date till;
	/**
	 * An ID of the {@link com.untill.driver.untillapi.users.User#id user}
	 */
	private long userId;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

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

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ZReportPrintingRequest{"
				+ "number=" + number
				+ ", from=" + from
				+ ", till=" + till
				+ ", userId=" + userId
				+ "} "
				+ super.toString();
	}
}
