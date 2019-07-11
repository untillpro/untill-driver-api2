package com.untill.driver.untillapi.proformas;

import java.util.List;

import com.untill.driver.IDriverContext;
import com.untill.driver.interfaces.eft.EftResultFields;
import com.untill.driver.untillapi.IUntillApi;
import com.untill.driver.untillapi.exceptions.EUntillApiCustomError;
import com.untill.driver.untillapi.exceptions.EUntillTpapiError;
import com.untill.driver.untillapi.exceptions.EUntillTpapiUnavailable;

/**
 * UntillAPI for working with Proformas
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillProformasApi extends IUntillApi {

	/**
	 * @param fieldName
	 *            One of {@link EftResultFields} constants to search payments by
	 * @param value
	 *            Value for searching
	 * @return Returns list of ProformaPayment, or empty list if no payment
	 *         found
	 * @see ProformaPayment
	 */
	List<ProformaPayment> getPaymentByEftField(String fieldName, String value);

	/**
	 * @return Returns list of proformas printed for tables which are still open
	 */
	List<Proforma> getOpenTableProformas();

	/**
	 * @param id
	 *            Proforma ID
	 * @return Returns Proforma data, or null if Proforma not found
	 */
	Proforma getProformaPrinted(Long id);

	/**
	 * Pays proforma
	 * 
	 * @param proforma
	 *            Proforma to pay
	 * @param payment
	 *            Payment details
	 * @throws EUntillTpapiUnavailable when TPAPI is not configured properly in unTill(r)
	 * @throws EUntillTpapiError in case of any TPAPI error
	 * @throws EUntillApiCustomError in case of any custom error
	 */
	void payProforma(Proforma proforma, ProformaPayment payment)
			throws EUntillTpapiUnavailable, EUntillTpapiError, EUntillApiCustomError;

}
