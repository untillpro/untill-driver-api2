package com.untill.driver.interfaces.timeattendance;

/**
 * A request for {@link ITimeAttendance} <tt>end break</tt> operation
 */
public class TAEndBreakRequest extends TARequest {
	@Override
	public String toString() {
		return "TAEndBreakRequest{"
				+ "userId=" + getUserId()
				+ ", timestamp=" + getTimestamp()
				+ '}';
	}
}
