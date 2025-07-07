package com.untill.driver.untillapi.tables;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

import java.util.Set;

/**
 * UntillAPI for working with tables
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillTablesApi extends IUntillApi {
	/**
	 * Returns linked tables by main table number with the main table number or empty set if there are no linked tables
	 *
	 * @param mainTableNumber main table number
	 * @return table numbers
	 */
	Set<Integer> getLinkedTables(int mainTableNumber);
}
