package com.untill.driver.interfaces.fiscalprinter;

import java.util.HashMap;
import java.util.Map;

public class FiscalOperationResult extends FiscalPrinterResult {
	private Map<String, String> data = new HashMap<>();

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

}
