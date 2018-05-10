package com.untill.driver.interfaces.bills;

import java.util.HashMap;
import java.util.Map;

import com.untill.driver.interfaces.DriverResult;

/**
 * Basic class for {@link IBillsHandler} method responses
 * 
 */
public class BillsHandlerResult extends DriverResult {

	private Map<String, String> data = new HashMap<>();

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}


}
