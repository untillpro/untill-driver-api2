package com.untill.driver.interfaces.eft;

import java.util.HashMap;
import java.util.Map;

public abstract class EftGiftCardModifyTransactionRequest extends EftRequest {

	private Map<String, String> data = new HashMap<>();

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

}
