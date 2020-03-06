package com.untill.driver.interfaces.hotel;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description of the custom lookup criterias supported by hotel interface.
 *
 * @see IHotelSupportsCustomLookupCriterias
 * @see GuestLookupCriteria
 */
public class CustomLookupCriterias {

	private Map<String, String> items = new LinkedHashMap<>();

	private String hardwareInputCriteriaKey;

	/**
	 * @return Returns a key of criteria which is used for hardware input (MSR,
	 * Cardreaders, etc). When not specified, unTill users
	 * "Folio Number" field.
	 */
	public String getHardwareInputCriteriaKey() {
		return hardwareInputCriteriaKey;
	}

	public void setHardwareInputCriteriaKey(String hardwareInputCriteriaKey) {
		this.hardwareInputCriteriaKey = hardwareInputCriteriaKey;
	}

	/**
	 * @return Returns a map (key-title) of additional supported lookup
	 * criterias. A key is sent in
	 * {@link GuestLookupCustom}.
	 */
	public Map<String, String> getItems() {
		return items;
	}

	public void setItems(Map<String, String> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "CustomLookupCriterias{"
				+ "items=" + items
				+ ", hardwareInputCriteriaKey='" + hardwareInputCriteriaKey + '\''
				+ '}';
	}
}
