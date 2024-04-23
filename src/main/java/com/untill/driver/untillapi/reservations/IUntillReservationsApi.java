package com.untill.driver.untillapi.reservations;

import com.untill.driver.IDriverContext;
import com.untill.driver.interfaces.bills.Bill;
import com.untill.driver.untillapi.IUntillApi;

import java.util.List;

/**
 * UntillAPI for working with Reservations
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillReservationsApi extends IUntillApi {

	/**
	 * @param reference Reference to find reservations by
	 * @return Returns reservations by reference
	 */
	List<Reservation> getReservations(String reference);

	/**
	 * Inserts or updates reservation in database. When "id" is null, item
	 * inserted, otherwise updated
	 *
	 * @param item Reservation to insert or update
	 * @return Returns item ID
	 */
	Long saveReservation(Reservation item);

	/**
	 * Returns list of reservations
	 *
	 * @param updatedSince when null, method returns only active reservations (status =
	 *                     NOT_ACCEPTED or ACCEPTED). When updatedSince is not null, it
	 *                     returns all reservations updated since specified time
	 * @return List of reservations
	 */
	List<Reservation> getReservations(Long updatedSince);

	Reservation getReservation(Long id);

	/**
	 * Returns list of reservations
	 *
	 * @param id {@link Bill#getTransactionId() bill ID}
	 * @return List of reservations
	 */
	List<Reservation> getReservationsByBillId(Long id);
}
