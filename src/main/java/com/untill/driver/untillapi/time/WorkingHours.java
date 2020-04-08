package com.untill.driver.untillapi.time;

import java.time.LocalTime;

/**
 * Hours of service
 */
public class WorkingHours {
	/**
	 * Start of work
	 */
	private LocalTime from;
	/**
	 * End of work
	 */
	private LocalTime to;

	public LocalTime getFrom() {
		return from;
	}

	public void setFrom(LocalTime from) {
		this.from = from;
	}

	public LocalTime getTo() {
		return to;
	}

	public void setTo(LocalTime to) {
		this.to = to;
	}
}
