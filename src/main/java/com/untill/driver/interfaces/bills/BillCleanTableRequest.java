package com.untill.driver.interfaces.bills;

/**
 * POS sends this request when action <tt>Restaurant:Make table clean</tt> is invoked
 *
 * @see IBillsHandler
 * @see BillsHandlerRequest
 */
public class BillCleanTableRequest extends BillsHandlerRequest {
	@Override
	public String toString() {
		return "BillCleanTableRequest{} " + super.toString();
	}
}
