package com.untill.driver.interfaces.eft;

/**
 * Gift Card Payment Request.
 * Provides amount to withdraw from gift card. 
 * Driver responds with {@link EftResult} or throws RuntimeException. 
 * <br>Current card balance may returned in {@link EftResult#getData()} under {@link EftResultFields#CURRENT_BALANCE} key in cents.
 * <br>Old card balance may be returned in {@link EftResult#getData()} under {@link EftResultFields#OLD_BALANCE} key in cents.  
 * @see IEft
 */
public class EftGiftCardPaymentRequest extends EftGiftCardValueTransactionRequest {
	@Override
	public String toString() {
		return "EftGiftCardPaymentRequest{} " + super.toString();
	}
}
