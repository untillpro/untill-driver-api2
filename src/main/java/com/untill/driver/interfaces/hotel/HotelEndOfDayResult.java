package com.untill.driver.interfaces.hotel;

import java.util.HashMap;
import java.util.Map;

/**
 * Result of {@link IHotelSupportsEndOfDay} "End of day" operation
 *
 */
public class HotelEndOfDayResult extends HotelInterfaceResult {

	private Map<String, String> data = new HashMap<>();

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public static class Builder {
		private HotelEndOfDayResult res;

		public Builder() {
			res = new HotelEndOfDayResult();
		}

		public HotelEndOfDayResult build() {
			return res;
		}

		public void putData(String key, String value) {
			res.data.put(key, value);
		}
	}

}
