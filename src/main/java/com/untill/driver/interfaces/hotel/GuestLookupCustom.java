package com.untill.driver.interfaces.hotel;

/**
 * Class used for requesting guest by custom value. Hotel driver must provide
 * {@link IHotelSupportsCustomLookupCriterias} interface to specify which criterias
 * supported
 *
 * @see IHotelSupportsCustomLookupCriterias
 */
public class GuestLookupCustom extends GuestLookupCriteria {

	private String key;

	private String value;

	/**
	 * @return Returns a key of criteria, registered by
	 * {@link IHotelSupportsCustomLookupCriterias}
	 */
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return Returns value for criteria specified by user
	 */
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "GuestLookupCustom{"
				+ "key='" + key + '\''
				+ ", value='" + value + '\''
				+ '}';
	}
}
