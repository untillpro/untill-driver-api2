package com.untill.driver.interfaces.bills;

/**
 * An instance of this class returned by {@link IBillsHandler#getSettings()} to specify details of driver behavior
 *
 * @see IBillsHandler
 */
public class BillsHandlerSettings {
	public static final int DEFAULT_WAIT_TIMEOUT = 50_000;
	private boolean consolidatedCombiDealsExpected;
	private int waitTimeout = DEFAULT_WAIT_TIMEOUT;
	/**
	 * Indicates whether open discounts should be applied during bill processing.
	 * When set to true, then POS sends order items with applied open discount.
	 */
	private boolean applyOpenDiscount;

	/**
	 * @return true if the driver expects combi-deals to be sent from POS consolidated in the {@link Bill} object
	 */
	public boolean isConsolidatedCombiDealsExpected() {
		return consolidatedCombiDealsExpected;
	}

	/**
	 * Specifies how the driver expects combi-deals to be sent from POS
	 *
	 * @param consolidatedCombiDealsExpected true to send combi-deals consolidated
	 */
	public void setConsolidatedCombiDealsExpected(boolean consolidatedCombiDealsExpected) {
		this.consolidatedCombiDealsExpected = consolidatedCombiDealsExpected;
	}

	/**
	 * @return Returns timeout in milliseconds telling how long unTill waits for
	 * an answer from driver before it shows "Timeout" error. Default timeout
	 * is 50000.
	 */
	public int getWaitTimeout() {
		return waitTimeout;
	}

	/**
	 * Sets timeout telling how long unTill waits for an answer
	 * from driver before it shows "Timeout" error
	 *
	 * @param waitTimeout Timeout, in milliseconds
	 */
	public void setWaitTimeout(int waitTimeout) {
		this.waitTimeout = waitTimeout;
	}

	public boolean isApplyOpenDiscount() {
		return applyOpenDiscount;
	}

	public void setApplyOpenDiscount(boolean applyOpenDiscount) {
		this.applyOpenDiscount = applyOpenDiscount;
	}
}
