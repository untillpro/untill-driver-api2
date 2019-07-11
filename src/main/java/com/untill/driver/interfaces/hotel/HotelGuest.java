package com.untill.driver.interfaces.hotel;

import java.util.HashMap;
import java.util.Map;

/**
 * Hotel interface guest information
 * 
 */
public class HotelGuest {

	private String room;

	private Integer sequence;

	private String name;

	private String reservationId;

	private Map<String, String> extra = new HashMap<String, String>();

	private Map<String, String> displayValues = new HashMap<String, String>();

	/**
	 * @return Returns values which displayed for this client in
	 *         "Hotel Guest Identification" list
	 */
	public Map<String, String> getDisplayValues() {
		return displayValues;
	}

	/**
	 * Sets values which displayed for this client in
	 * "Hotel Guest Identification" list
	 * @param displayValues Values to display
	 */
	public void setDisplayValues(Map<String, String> displayValues) {
		this.displayValues = displayValues;
	}

	/**
	 * @return Returns guest's room which can be either number or an
	 *         alphanumerical
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * Sets guest's room which can be either number or an alphanumerical
	 * 
	 * @param room
	 *            Room number
	 */
	public void setRoom(String room) {
		this.room = room;
	}

	/**
	 * @return Returns guest's sequence number
	 */
	public Integer getSequence() {
		return sequence;
	}

	/**
	 * Sets guest's sequence number
	 * 
	 * @param sequence
	 *            Sequence number
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return Returns guest's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets guest's name
	 * 
	 * @param name
	 *            Name of a guest
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns any additional information related to this guest
	 */
	public Map<String, String> getExtra() {
		return extra;
	}

	/**
	 * Sets any additional information related to this guest
	 * 
	 * @param extra Extra information
	 */
	public void setExtra(Map<String, String> extra) {
		this.extra = extra;
	}

	/**
	 * @return Returns guest's reservation identifier which must be unique per
	 *         quest
	 */
	public String getReservationId() {
		return reservationId;
	}

	/**
	 * Sets guest's reservation identifier which must be unique per quest
	 * 
	 * @param reservationId
	 *            Reservation identifier
	 */
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

}
