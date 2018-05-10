package com.untill.driver.interfaces.bills;

/**
 * When this exception is thrown from the {@link IBillsHandler} methods, POS
 * continues normal flow, in one minute the same driver method is called again
 * with the same arguments, in case of same failure error show in in POS
 * allowing user to choose what to do:
 * <ul>
 * <li>another attempt of the same operation</li>
 * <li>cancel this job, do not make more attempts of this operation</li>
 * </ul>
 */
public class EBillErrorAsyncResolution extends RuntimeException {

	private static final long serialVersionUID = 1314997239289819224L;

	public EBillErrorAsyncResolution(Throwable e) {
		super(e.getClass().getName() + ": " + e.getMessage());
	}

	public EBillErrorAsyncResolution(String e) {
		super(e);
	}

}
