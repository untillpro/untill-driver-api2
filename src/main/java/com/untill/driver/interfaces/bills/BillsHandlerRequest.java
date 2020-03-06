package com.untill.driver.interfaces.bills;

import java.util.Date;

import com.untill.driver.interfaces.DriverRequest;

/**
 * Basic class for {@link IBillsHandler} method requests
 */
public abstract class BillsHandlerRequest extends DriverRequest {

	private Bill bill;

	private Date timestamp;

	/**
	 * @return Returns the timestamp of the operation
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp of the operation
	 *
	 * @param timestamp Timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return Returns the bill associated with the operation
	 */
	public Bill getBill() {
		return bill;
	}

	/**
	 * Sets the bill associated with the operation
	 *
	 * @param bill Bill to set
	 */
	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "BillsHandlerRequest{"
				+ "bill=" + bill
				+ ", timestamp=" + timestamp
				+ "}";
	}
}
