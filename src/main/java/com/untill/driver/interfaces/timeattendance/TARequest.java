package com.untill.driver.interfaces.timeattendance;

import com.untill.driver.interfaces.DriverRequest;

import java.util.Date;

/**
 * Basic class for {@link ITimeAttendance} requests
 */
public abstract class TARequest extends DriverRequest {

	/**
	 * User ID
	 */
	private long userId;
	/**
	 * Timestamp when some event occurred e.g. <tt>clock in</tt>, <tt>end break</tt>, etc.
	 */
	private Date timestamp;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
