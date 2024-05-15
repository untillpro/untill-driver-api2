package com.untill.driver.interfaces.bills;

import com.untill.driver.interfaces.fiscalprinter.IFiscalPrinter;

/**
 * An instance of this class returned by {@link IBillsHandler#getSettings()} to specify details of driver behavior
 *
 * @see IFiscalPrinter
 */
public class BillsHandlerSettings {
	
	
	boolean consolidatedCombiDealsExpected;

	/**
	 * Returns true if the driver expects combi-deals to be sent from POS consolidated in the {@link Bill} object
	 */
	public boolean isConsolidatedCombiDealsExpected() {
		return consolidatedCombiDealsExpected;
	}

	/**
	 * Specifies that the driver expects combi-deals to be sent from POS consolidated in the {@link Bill} object
	 */
	public void setConsolidatedCombiDealsExpected(boolean consolidatedCombiDealsExpected) {
		this.consolidatedCombiDealsExpected = consolidatedCombiDealsExpected;
	}


}
