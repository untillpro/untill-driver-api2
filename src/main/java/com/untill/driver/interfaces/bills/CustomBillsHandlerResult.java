package com.untill.driver.interfaces.bills;

import com.untill.driver.interfaces.DriverResult;

import java.util.HashMap;
import java.util.Map;

/**
 * Basic class for {@link ICustomBillsHandler} result
 */
public class CustomBillsHandlerResult extends DriverResult {

	/**
	 * Map of operation result data
	 */
	private Map<String, String> data = new HashMap<>();

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}
}
