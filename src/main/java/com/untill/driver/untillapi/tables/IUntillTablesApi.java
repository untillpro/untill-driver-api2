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
	 * Returns a set containing the main table number and its linked tables,
	 * or an empty set if there are no linked tables for the given main table number and reservation reference.
	 *
	 * @param mainTableNumber      main table number
	 * @param reservationReference reservation reference
	 * @return table numbers
	 */
	Set<Integer> getLinkedTables(int mainTableNumber, String reservationReference);
}
