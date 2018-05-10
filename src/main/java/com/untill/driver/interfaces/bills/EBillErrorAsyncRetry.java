package com.untill.driver.interfaces.bills;

/**
 * When this exception is thrown from the {@link IBillsHandler} methods, POS continues normal flow,
 * in one minute the same driver method is called again with the same arguments
 */
public class EBillErrorAsyncRetry extends RuntimeException {

	private static final long serialVersionUID = 7115732004196010089L;

	public EBillErrorAsyncRetry(Throwable e) {
		super(e.getClass().getName() + ": " + e.getMessage());
	}

	public EBillErrorAsyncRetry(String e) {
		super(e);
	}

}
