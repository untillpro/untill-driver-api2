package com.untill.driver.untillapi.time;

import java.util.Date;

/**
 * Hours of service
 */
public class WorkingHours {
	/**
	 * Start of work
	 */
	private Date from;
	/**
	 * End of work
	 */
	private Date to;

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}
}
