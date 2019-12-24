package com.untill.driver.untillapi.proformas;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Proforma payment data
 *
 * @see Proforma
 */
public class ProformaPayment {

	private BigDecimal amount;

	private BigDecimal tip;

	private Long paymentId;

	/**
	 * AppToken is a TPAPI app token identifying your application. Please refer to TPAPI POS documentation for details.
	 */
	private String appToken;

	/**
	 * AppName is a TPAPI app name identifying your application. Please refer to TPAPI POS documentation for details.
	 */
	private String appName;

	private Map<String, String> dataFields = new HashMap<String, String>();

	public Map<String, String> getDataFields() {
		return dataFields;
	}

	public void setDataFields(Map<String, String> dataFields) {
		this.dataFields = dataFields;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTip() {
		return tip;
	}

	public void setTip(BigDecimal tip) {
		this.tip = tip;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public String getAppToken() {
		return appToken;
	}

	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
