package com.untill.driver.interfaces.timeattendance;

/**
 * A request for {@link ITimeAttendance} <tt>clock out</tt> operation
 */
public class TAClockOutRequest extends TARequest {
	@Override
	public String toString() {
		return "TAClockOutRequest{"
				+ "userId=" + getUserId()
				+ ", timestamp=" + getTimestamp()
				+ '}';
	}
}
