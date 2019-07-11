package com.untill.driver.interfaces.hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Data of an "End of Day" operation handled by {@link IHotelSupportsEndOfDay}
 *
 */
public class EndOfDayData {

	private Date from;

	private Date till;

	private List<EndOfDayTurnoverItem> turnover = new ArrayList<>();

	private List<EndOfDayExtraItem> extra = new ArrayList<>();

	private List<EndOfDayPaymentItem> payments = new ArrayList<>();

	/**
	 * @return Returns "from" date
	 */
	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	/**
	 * @return Returns "till" date
	 */
	public Date getTill() {
		return till;
	}

	public void setTill(Date till) {
		this.till = till;
	}

	/**
	 * @return Returns the list of turnover items over the period
	 */
	public List<EndOfDayTurnoverItem> getTurnover() {
		return turnover;
	}

	public void setTurnover(List<EndOfDayTurnoverItem> turnover) {
		this.turnover = turnover;
	}

	/**
	 * @return Returns the list of payment items over the period
	 */
	public List<EndOfDayPaymentItem> getPayments() {
		return payments;
	}

	public void setPayments(List<EndOfDayPaymentItem> payments) {
		this.payments = payments;
	}

	/**
	 * @return Returns the list of extra items over the period
	 * @see EndOfDayExtraItem
	 */
	public List<EndOfDayExtraItem> getExtra() {
		return extra;
	}

	public void setExtra(List<EndOfDayExtraItem> extra) {
		this.extra = extra;
	}
	
	

}
