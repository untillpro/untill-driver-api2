package com.untill.driver.untillapi.reservations;

import java.util.List;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with Reservations
 * 
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillReservationsApi extends IUntillApi {

	/**
	 * @return Returns reservations by reference
	 */
	public List<Reservation> getReservations(String reference);

	/**
	 * Inserts or updates reservation in database. When "id" is null, item
	 * inserted, otherwise updated
	 * 
	 * @param item
	 *            Reservation to insert or update
	 * @return Returns item ID
	 */
	public Long saveReservation(Reservation item);

	/**
	 * Restuns list of reservations
	 * 
	 * @param updatedSince
	 *            when null, method returns only active reservations (status =
	 *            NOT_ACCEPTED or ACCEPTED). When updatedSince is not null, it
	 *            returns all reservations updated since specified time
	 * @return List of reservations
	 */
	public List<Reservation> getReservations(Long updatedSince);
	
	public Reservation getReservation(Long id);

}
