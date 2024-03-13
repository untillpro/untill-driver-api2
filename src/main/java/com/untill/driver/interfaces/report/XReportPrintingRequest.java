package com.untill.driver.interfaces.report;

import java.util.Date;

/**
 * A request for {@link IReportHandler} <tt>X-report printed</tt> operation
 */
public class XReportPrintingRequest extends ReportHandlerRequest {
	/**
	 * X-report from timestamp
	 */
	private Date from;
	/**
	 * X-report till timestamp
	 */
	private Date till;
	/**
	 * An ID of the {@link com.untill.driver.untillapi.users.User#id user}
	 */
	private long userId;

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
		return "XReportPrintingRequest{"
				+ "from=" + from
				+ ", till=" + till
				+ ", userId=" + userId
				+ "} "
				+ super.toString();
	}
}
