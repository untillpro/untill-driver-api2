package com.untill.driver.interfaces.hotel;

import java.util.HashMap;
import java.util.Map;

/**
 * A result of {@link IHotelInterface} "charge" operation
 *
 */
public class HotelChargeResult extends HotelInterfaceResult {

	private Map<String, String> data = new HashMap<>();

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}


}
