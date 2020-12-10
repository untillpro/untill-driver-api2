package com.untill.driver.interfaces.fiscalprinter;

import com.untill.driver.IDriverProgress;

public enum FiscalOperationProgressKind {
	
	/**
	 * Do not show any kind of progress in POS
	 */
	HIDDEN, 
	/**
	 * Show "please wait" pop-up in POS, with possibility to show custom message 
	 * using {@link IDriverProgress#showProgressMessage(String, String)} 
	 */
	VISIBLE, 
	/**
	 * Show "please wait" pop-up in POS, with possibility to show custom message 
	 * using {@link IDriverProgress#showProgressMessage(String, String)} and the
	 * possibility to cancel operation, see {@link IDriverProgress#isCancelRequested(String)}  
	 */
	WITH_CANCEL

}
