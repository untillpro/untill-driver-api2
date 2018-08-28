package com.untill.driver.untillapi.countries;

import java.util.List;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with Countries
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillCountriesApi extends IUntillApi {
	
	/**
	 * @return Returns list of countries in database
	 */
	public List<Country> getCountries();
	
	/**
	 * Inserts or updates country in database. When "id" is null, item inserted, otherwise updated
	 * @param item Country to insert or update
	 * @return Returns item ID
	 */
	public Long saveCountry(Country item);

}
