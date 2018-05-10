package com.untill.driver.untillapi.exceptions;

public class EUntillApiCustomError extends EUntillApiException {

	private static final long serialVersionUID = 2539018737882722765L;

	public EUntillApiCustomError(Throwable e) {
		super(e);
	}

	public EUntillApiCustomError(String message) {
		super(message);
	}

	public EUntillApiCustomError(String message, Throwable e) {
		super(message, e);
	}
}
