package com.untill.driver.interfaces.eft;

/**
 * Gift Card Deactivation request. Driver responds with {@link EftResult} or throws RuntimeException. 
 * @see IEft 
 *
 */
public class EftGiftCardDeactivateRequest extends EftGiftCardTransactionRequest {
	@Override
	public String toString() {
		return "EftGiftCardDeactivateRequest{} " + super.toString();
	}
}
