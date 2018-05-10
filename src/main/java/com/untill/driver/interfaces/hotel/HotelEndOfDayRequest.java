package com.untill.driver.interfaces.hotel;

/**
 * Request for {@link IHotelSupportsEndOfDay} "End of day" operation
 *
 */
public class HotelEndOfDayRequest extends HotelInterfaceRequest {

	private EndOfDayData data;

	/**
	 * @return Returns "End of Day" data
	 */
	public EndOfDayData getData() {
		return data;
	}

	/**
	 * Sets "End of Day" data
	 * @param data
	 */
	public void setData(EndOfDayData data) {
		this.data = data;
	}

}
