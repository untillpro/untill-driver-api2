package com.untill.driver.interfaces.hotel;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
* A result of "Get Hotel Room" {@link IHotelSupportsRoomInformation} operation
 */

public class GetHotelRoomResult extends HotelInterfaceResult {

	private String reservationId;
	private String vipCode;
	private Date arrivalDate;
	private Date departureDate;
	private Date nextArrival;
	private Date lastDeparture;
	private int stayCount;
	private String breakfastInfo;
	private String breakfastPrice;
	private boolean hasBreakfast;
	private String lunchInfo;
	private String lunchPrice;
	private boolean hasLunch;
	private String dinnerInfo;
	private String dinnerPrice;
	private boolean hasDinner;
	private String dietInfo;
	private String remarks;
	private String foodPreference;
	private String beveragePreference;
	private Map<String, String> extra = new HashMap<String, String>();

	/**
	 * @return Returns reservation ID
	 */
	public String getReservationId() {
		return reservationId;
	}

	/**
	 * Sets reservation ID
	 * 
	 * @param reservationId
	 *            Reservation ID to set
	 */
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	/**
	 * @return Returns VIP code
	 */
	public String getVipCode() {
		return vipCode;
	}

	/**
	 * Sets VIP code
	 * 
	 * @param vipCode
	 *            VIP code to set
	 */
	public void setVipCode(String vipCode) {
		this.vipCode = vipCode;
	}

	/**
	 * @return Returns arrival date
	 */
	public Date getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * Sets arrival date
	 * 
	 * @param arrivalDate
	 *            Arrival date to set
	 */
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * @return Returns departure date
	 */
	public Date getDepartureDate() {
		return departureDate;
	}

	/**
	 * Sets departure date
	 * 
	 * @param departureDate
	 *            Departure date to set
	 */
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return Returns next arrival date
	 */
	public Date getNextArrival() {
		return nextArrival;
	}

	/**
	 * Sets next arrival date
	 * 
	 * @param nextArrival
	 *            Next arrival date to set
	 */
	public void setNextArrival(Date nextArrival) {
		this.nextArrival = nextArrival;
	}

	/**
	 * @return Returns last departure date
	 */
	public Date getLastDeparture() {
		return lastDeparture;
	}

	/**
	 * Sets last departure date
	 * 
	 * @param lastDeparture
	 *            Last departure date to set
	 */
	public void setLastDeparture(Date lastDeparture) {
		this.lastDeparture = lastDeparture;
	}

	/**
	 * @return Returns stay count
	 */
	public int getStayCount() {
		return stayCount;
	}

	/**
	 * Sets stay count
	 * 
	 * @param stayCount
	 *            Stay count to set
	 */
	public void setStayCount(int stayCount) {
		this.stayCount = stayCount;
	}

	/**
	 * @return Returns breakfast information
	 */
	public String getBreakfastInfo() {
		return breakfastInfo;
	}

	/**
	 * Sets breakfast information
	 * 
	 * @param breakfastInfo
	 *            Breakfast information to set
	 */
	public void setBreakfastInfo(String breakfastInfo) {
		this.breakfastInfo = breakfastInfo;
	}

	/**
	 * @return Returns breakfast price
	 */
	public String getBreakfastPrice() {
		return breakfastPrice;
	}

	/**
	 * Sets breakfast price
	 * 
	 * @param breakfastPrice
	 *            Breakfast price to set
	 */
	public void setBreakfastPrice(String breakfastPrice) {
		this.breakfastPrice = breakfastPrice;
	}

	/**
	 * @return Returns true if guest has breakfast, false otherwise
	 */
	public boolean isHasBreakfast() {
		return hasBreakfast;
	}

	/**
	 * Sets if guest has breakfast or not
	 * 
	 * @param hasBreakfast
	 *            True if that guest has breakfast, false otherwise
	 */
	public void setHasBreakfast(boolean hasBreakfast) {
		this.hasBreakfast = hasBreakfast;
	}

	/**
	 * @return Returns lunch information
	 */
	public String getLunchInfo() {
		return lunchInfo;
	}

	/**
	 * Sets lunch information
	 * 
	 * @param lunchInfo
	 *            Lunch information to set
	 */
	public void setLunchInfo(String lunchInfo) {
		this.lunchInfo = lunchInfo;
	}

	/**
	 * @return Returns lunch price
	 */
	public String getLunchPrice() {
		return lunchPrice;
	}

	/**
	 * Sets lunch price
	 * 
	 * @param lunchPrice
	 *            Lunch price to set
	 */
	public void setLunchPrice(String lunchPrice) {
		this.lunchPrice = lunchPrice;
	}

	/**
	 * @return Returns true if guest has lunch, false otherwise
	 */
	public boolean isHasLunch() {
		return hasLunch;
	}

	/**
	 * Sets if guest has lunch or not
	 * 
	 * @param hasLunch
	 *            True if that guest has lunch, false otherwise
	 */
	public void setHasLunch(boolean hasLunch) {
		this.hasLunch = hasLunch;
	}

	/**
	 * @return Returns dinner information
	 */
	public String getDinnerInfo() {
		return dinnerInfo;
	}

	/**
	 * Sets Returns dinner information
	 * 
	 * @param dinnerInfo
	 *            Dinner information to set
	 */
	public void setDinnerInfo(String dinnerInfo) {
		this.dinnerInfo = dinnerInfo;
	}

	/**
	 * @return Returns dinner price
	 */
	public String getDinnerPrice() {
		return dinnerPrice;
	}

	/**
	 * Sets dinner price
	 * 
	 * @param dinnerPrice
	 *            Dinner price to set
	 */
	public void setDinnerPrice(String dinnerPrice) {
		this.dinnerPrice = dinnerPrice;
	}

	/**
	 * @return Returns true if guest has dinner, false otherwise
	 */
	public boolean isHasDinner() {
		return hasDinner;
	}

	/**
	 * Sets if guest has dinner or not
	 * 
	 * @param hasDinner
	 *            True if that guest has dinner, false otherwise
	 */
	public void setHasDinner(boolean hasDinner) {
		this.hasDinner = hasDinner;
	}

	/**
	 * @return Returns diet information
	 */
	public String getDietInfo() {
		return dietInfo;
	}

	/**
	 * Sets diet information
	 * 
	 * @param dietInfo
	 *            diet information to set
	 */
	public void setDietInfo(String dietInfo) {
		this.dietInfo = dietInfo;
	}

	/**
	 * @return Returns remarks on this guest
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * Sets remarks on this guest
	 * 
	 * @param remarks
	 *            Remarks on this guest to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return Returns guest's food preference
	 */
	public String getFoodPreference() {
		return foodPreference;
	}

	/**
	 * Sets guest's food preference
	 * 
	 * @param foodPreference
	 *            Food preference to set
	 */
	public void setFoodPreference(String foodPreference) {
		this.foodPreference = foodPreference;
	}

	/**
	 * @return Returns guest's beverage preference
	 */
	public String getBeveragePreference() {
		return beveragePreference;
	}

	/**
	 * Sets guest's beverage preference
	 * 
	 * @param beveragePreference
	 *            Beverage preference to set
	 */
	public void setBeveragePreference(String beveragePreference) {
		this.beveragePreference = beveragePreference;
	}

	/**
	 * @return Returns any extra information related to this room
	 */
	public Map<String, String> getExtra() {
		return extra;
	}

	/**
	 * Sets any extra information related to this room
	 * 
	 * @param extra
	 */
	public void setExtra(Map<String, String> extra) {
		this.extra = extra;
	}

	public GetHotelRoomResult() {
	}

}
