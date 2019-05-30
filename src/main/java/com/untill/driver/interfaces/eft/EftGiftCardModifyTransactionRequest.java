package com.untill.driver.interfaces.eft;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class EftGiftCardModifyTransactionRequest extends EftRequest {

	private Map<String, String> data = new HashMap<>();

	private Date timestamp;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

}
