package com.untill.driver.interfaces.timeattendance;

import com.untill.driver.interfaces.DriverResult;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents result of {@link ITimeAttendance} operation
 */
public class TAResult extends DriverResult {

	/**
	 * Map with operation result data
	 */
	private Map<String, String> data = new HashMap<>();

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}
}
