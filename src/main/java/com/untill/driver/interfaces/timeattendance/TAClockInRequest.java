package com.untill.driver.interfaces.timeattendance;

/**
 * A request for {@link ITimeAttendance} <tt>clock in</tt> operation
 */
public class TAClockInRequest extends TARequest {
	@Override
	public String toString() {
		return "TAClockInRequest{"
				+ "userId=" + getUserId()
				+ ", timestamp=" + getTimestamp()
				+ '}';
	}
}
