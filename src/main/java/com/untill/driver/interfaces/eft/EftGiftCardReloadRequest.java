package com.untill.driver.interfaces.eft;

/**
 * Gift Card Reload Request - called to increase card balance by certain amount.
 * <br>Driver responds with {@link EftResult} or throws RuntimeException.
 * <br>Current card balance returned in {@link EftResult#getData()} under {@link EftResultFields#CURRENT_BALANCE} key in cents.
 * <br>Old card balance may be returned in {@link EftResult#getData()} under {@link EftResultFields#OLD_BALANCE} key in cents.  
 * @see IEft
 */
public class EftGiftCardReloadRequest extends EftGiftCardValueTransactionRequest {
	@Override
	public String toString() {
		return "EftGiftCardReloadRequest{} " + super.toString();
	}
}
