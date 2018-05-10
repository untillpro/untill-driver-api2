package com.untill.driver.untillapi.currency;

import java.math.BigDecimal;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with Currency
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillCurrencyApi extends IUntillApi {

	/**
	 * Get amount in cents using the rounding method which is the same with
	 * unTill POS
	 * 
	 * @param amount
	 * @return
	 */
	int getInCents(BigDecimal amount);

	/**
	 * @return Returns the information about main currency in unTill(r) database
	 */
	CurrencyInfo getMainCurrency();

}
