package com.untill.driver.interfaces.eft;

import java.util.HashMap;
import java.util.Map;

import com.untill.driver.interfaces.DriverResult;

/**
 * Represents result of {@link IEft} operation
 *
 * @see IEft
 */
public class EftResult extends DriverResult {

	private Map<String, String> data = new HashMap<>();
	
	private int transactionResult;
	
	private String displayMessage;

	/**
	 * @return Returns the message to display in POS
	 */
	public String getDisplayMessage() {
		return displayMessage;
	}

	/**
	 * Sets the message to display in POS
	 * @param displayMessage Message to display in POS
	 */
	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}

	public EftResult() {
	}

	/**
	 * @return Returns one of {@link EftTransactionResult} codes
	 */
	public int getTransactionResult() {
		return transactionResult;
	}

	/**
	 * Sets the operation result, one of {@link EftTransactionResult} codes
	 * 
	 * @param transactionResult
	 */
	public void setTransactionResult(int transactionResult) {
		this.transactionResult = transactionResult;
	}

	/**
	 * @return Returns the map of operation result data. Keys from the
	 *         {@link EftResultFields} may be used, or custom keys.
	 */
	public Map<String, String> getData() {
		return data;
	}

	/**
	 * Sets the map of operation result data. Keys from the
	 * {@link EftResultFields} may be used, or custom keys.
	 * 
	 * @param data
	 */
	public void setData(Map<String, String> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder text = new StringBuilder();

		text.append("EFT Result data >> \n");
		text.append("transactionResult : ").append(transactionResult).append("\n");

		for (String key : data.keySet()) {
			text.append(key.toString()).append(": ").append(data.get(key)).append("\n");
		}

		return text.toString();
	}

	/**
	 * A builder for {@link EftResult}
	 *
	 */
	public static class Builder {
		private EftResult res = new EftResult();

		public Builder() {
		}

		public EftResult build() {
			return res;
		}

		public Builder setTransactionResult(int transactionResult) {
			res.setTransactionResult(transactionResult);
			return this;
		}

		public Builder putData(String key, String value) {
			res.getData().put(key, value);
			return this;
		}
	}

}
