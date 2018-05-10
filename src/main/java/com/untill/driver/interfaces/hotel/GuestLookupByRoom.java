package com.untill.driver.interfaces.hotel;

/**
 * Criteria for requesting guest by room
 * 
 */
public class GuestLookupByRoom extends GuestLookupCriteria {

	private String room;

	private Integer sequence;

	/**
	 * @return Returns room number which is used for searching guest
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * Sets room number which is used for searching guest
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
	 * @param sequence Sequence number
	 */
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
}
