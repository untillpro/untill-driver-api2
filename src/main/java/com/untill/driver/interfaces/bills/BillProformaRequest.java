package com.untill.driver.interfaces.bills;

import java.math.BigDecimal;

/**
 * Class representing a request for "Bill Proforma" operation handled by {@link IBillsHandler}}
 *
 * @see IBillsHandler
 * @see BillsHandlerRequest
 */
public class BillProformaRequest extends BillsHandlerRequest {

	private long proformaId;

	private BigDecimal proformaTotal;

	private BigDecimal proformaTips;

	private boolean billSplit;

	public boolean isBillSplit() {
		return billSplit;
	}

	public void setBillSplit(boolean billSplit) {
		this.billSplit = billSplit;
	}

	/**
	 * @return Returns the total amount to pay by this proforma. This amont includes Tips, if added.
	 */
	public BigDecimal getProformaTotal() {
		return proformaTotal;
	}

	/**
	 * Sets total amount to pay by this proforma, including tips.
	 *
	 * @param proformaTotal Total amount to pay by proforma
	 */
	public void setProformaTotal(BigDecimal proformaTotal) {
		this.proformaTotal = proformaTotal;
	}

	public BigDecimal getProformaTips() {
		return proformaTips;
	}

	public void setProformaTips(BigDecimal proformaTips) {
		this.proformaTips = proformaTips;
	}

	public long getProformaId() {
		return proformaId;
	}

	public void setProformaId(long proformaId) {
		this.proformaId = proformaId;
	}

	@Override
	public String toString() {
		return "BillProformaRequest{"
				+ "proformaId=" + proformaId
				+ ", proformaTotal=" + proformaTotal
				+ ", proformaTips=" + proformaTips
				+ ", billSplit=" + billSplit
				+ "} " + super.toString();
	}
}
