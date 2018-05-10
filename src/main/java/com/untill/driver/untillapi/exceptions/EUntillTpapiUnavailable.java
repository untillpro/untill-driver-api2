package com.untill.driver.untillapi.exceptions;

public class EUntillTpapiUnavailable extends EUntillApiException {

	private static final long serialVersionUID = 8090607645868723662L;

	public EUntillTpapiUnavailable() {
		super("TPAPI unavailable");
	}

	public EUntillTpapiUnavailable(Throwable e) {
		super(e);
	}

}
