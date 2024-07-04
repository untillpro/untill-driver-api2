package com.untill.driver.untillapi.payments;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

import java.util.Optional;

/**
 * UntillAPI for working with payments
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillPaymentsApi extends IUntillApi {
	/**
	 * @param guid Payment GUID
	 * @return Returns ID of payment or null when payment not found by GUID
	 */
	Long getPaymentIdByGuid(String guid);

	/**
	 * Retrieves a <tt>payment</tt> based on the provided unique identifier (GUID).
	 *
	 * @param guid the unique identifier for the <tt>payment</tt> to be retrieved.
	 * @return an optional containing the <tt>payment</tt> if found, or an empty optional if not found.
	 *
	 * <p>Example usage:</p>
	 * <pre>
	 * {@code
	 * Optional<Payment> optional = paymentService.getPaymentByGuid("some-guid");
	 * if (optional.isPresent()) {
	 *     Payment payment = optional.get();
	 *     // Process payment
	 * } else {
	 *     // Handle case where payment is not found
	 * }
	 * }
	 * </pre>
	 */
	Optional<Payment> getPaymentByGuid(String guid);
}
