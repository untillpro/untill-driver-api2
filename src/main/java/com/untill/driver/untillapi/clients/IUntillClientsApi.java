package com.untill.driver.untillapi.clients;

import java.util.List;

import com.untill.driver.IDriverContext;
import com.untill.driver.untillapi.IUntillApi;

/**
 * UntillAPI for working with Clients
 * @see IUntillApi
 * @see IDriverContext
 */
public interface IUntillClientsApi extends IUntillApi {
	/**
	 * @return Returns list of clients in database
	 */
	public List<Client> getClients();
	
	/**
	 * Inserts or updates client in database. When "id" is null, item inserted, otherwise updated
	 * @param item
	 */
	public void saveClient(Client item);

}
