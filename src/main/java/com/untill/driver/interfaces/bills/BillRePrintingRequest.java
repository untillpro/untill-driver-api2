package com.untill.driver.interfaces.bills;

import java.util.HashMap;
import java.util.Map;

/**
 * Class representing a request for "Bill Re-print" operation handled by {@link IBillsHandler}}
 *
 * @see IBillsHandler
 * @see BillsHandlerRequest
 */
public class BillRePrintingRequest extends BillsHandlerRequest {

	private Map<String, String> data = new HashMap<>();

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BillRePrintingRequest{"
				+ "data=" + data
				+ "} " + super.toString();
	}
}
