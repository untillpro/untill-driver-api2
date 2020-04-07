package com.untill.driver.interfaces.timeattendance;

/**
 * A request for {@link ITimeAttendance} <tt>start break</tt> operation
 */
public class TAStartBreakRequest extends TARequest {

	/**
	 * Break reason ID
	 */
	private long reasonId;
	/**
	 * Break reason name
	 */
	private String reasonName;
	/**
	 * Comment for occurred start break event
	 */
	private String comment;

	public long getReasonId() {
		return reasonId;
	}

	public void setReasonId(long reasonId) {
		this.reasonId = reasonId;
	}

	public String getReasonName() {
		return reasonName;
	}

	public void setReasonName(String reasonName) {
		this.reasonName = reasonName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "TAStartBreakRequest{"
				+ "userId=" + getUserId()
				+ ", timestamp=" + getTimestamp()
				+ ", reasonId=" + reasonId
				+ ", reasonName='" + reasonName + '\''
				+ ", comment='" + comment + '\''
				+ '}';
	}
}
