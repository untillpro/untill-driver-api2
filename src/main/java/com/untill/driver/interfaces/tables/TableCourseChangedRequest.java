package com.untill.driver.interfaces.tables;

public class TableCourseChangedRequest extends TableChangedRequest {
	private long courseId;

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "TableCourseChangedRequest{"
				+ "courseId=" + courseId
				+ "} " + super.toString();
	}
}
