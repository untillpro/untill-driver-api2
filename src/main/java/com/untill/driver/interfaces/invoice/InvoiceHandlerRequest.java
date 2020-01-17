package com.untill.driver.interfaces.invoice;

import com.untill.driver.interfaces.DriverRequest;

/**
 * Basic class for {@link IInvoiceHandler} request
 */
public abstract class InvoiceHandlerRequest extends DriverRequest {

	private Client client;
	private Invoice invoice;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
