package com.untill.driver.interfaces.eft;

/**
 * Gift Card Activation request. Driver responds with {@link EftResult} or throws RuntimeException. 
 * Depending on unTill(r) POS action settings, cardId may be provided or not. 
 * If cardId not provided, driver must activate a new card and provide cardId in {@link EftResult#getData()}, 
 * under key {@link EftResultFields#CARD_NUMBER}
 * @see IEft 
 *
 */
public class EftGiftCardActivateRequest extends EftGiftCardValueTransactionRequest {
	
}
