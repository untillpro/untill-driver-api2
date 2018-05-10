package com.untill.driver.interfaces.hotel;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Interface introducing custom guest lookup criterias
 * 
 */
public interface IHotelSupportsCustomLookupCriterias extends IDriverInterface {

	/**
	 * @param cfg Driver Configuration
	 * @return Returns an instance of {@link CustomLookupCriterias} which is a description
	 * of custom criterias supported by this interface
	 */
	CustomLookupCriterias getCustomLookupCriterias(DriverConfiguration cfg);

}
