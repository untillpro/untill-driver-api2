package com.untill.driver.interfaces.fiscalprinter;

/**
 * Request for "fiscal open drawer" operation
 */
public class FiscalOpenDrawerRequest extends FiscalOperationRequest {

	private int drawerNumber;

	public int getDrawerNumber() {
		return drawerNumber;
	}

	public void setDrawerNumber(int drawerNumber) {
		this.drawerNumber = drawerNumber;
	}

	@Override
	public String toString() {
		return "FiscalOpenDrawerRequest{"
				+ "drawerNumber=" + drawerNumber
				+ '}';
	}
}
