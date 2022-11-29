package com.untill.driver.untillapi.dbstorage;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI allows to write/read data bytes to/from DB by driver configuration GUID and key.
 *
 * <pre>
 * {@code
 * //Example
 * public class SimpleEftDriver implements IDriver, IEft {
 *
 *     private static final String LAST_TRANSACTION_ID = "LAST_TRANSACTION_ID";
 *     private IUntillDbStorageApi storageApi;
 *
 *     public Map<Class<? extends IDriverInterface>, IDriverInterface> init(IDriverContext ctx) {
 *         storageApi = ctx.getApi(IUntillDbStorageApi.class);
 *         return DriverInterfaces.map(IEft.class, this);
 *     }
 *
 *     public EftResult operation(DriverConfiguration cfg, EftRequest req) {
 *         if (req instanceof EftPaymentRequest) {
 *             String transactionId = getNextTransactionId();
 *             EftResult res = doSale(cfg, transactionId, ((EftPaymentRequest) req).getAmount());
 *             storageApi.write(cfg.getConfigurationGuid(), LAST_TRANSACTION_ID, transactionId.getBytes(StandardCharsets.UTF_8));
 *             return res;
 *         }
 *         if (req instanceof EftCustomCommandRequest) {
 *             byte[] transactionId = storageApi.read(cfg.getConfigurationGuid(), LAST_TRANSACTION_ID);
 *             return reprintLastReceipt(cfg, new String(transactionId, StandardCharsets.UTF_8));
 *         }
 *         throw new RuntimeException("Operation not supported");
 *     }
 * }
 * }
 * </pre>
 *
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillDbStorageApi extends IUntillApi {
	/**
	 * Read data bytes by driver configuration GUID and key
	 *
	 * @param configurationGuid driver configuration GUID
	 * @param key               data key
	 * @return data bytes or <tt>null</tt> when data is not exists
	 */
	byte[] read(String configurationGuid, String key);

	/**
	 * Write data bytes by driver configuration GUID and key
	 *
	 * @param configurationGuid driver configuration GUID
	 * @param key               data key
	 * @param data              data bytes
	 */
	void write(String configurationGuid, String key, byte[] data);
}