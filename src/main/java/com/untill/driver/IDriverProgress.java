package com.untill.driver;

/**
 * Defines interface for communication with unTill during execution of
 * driver methods. Progress supported for all methods which receives
 * a descendant of DriverRequest class as an argument.
 *
 */
public interface IDriverProgress {

	/**
	 * @param requestGuid Request GUID
	 * @return Returns true if "Cancel" was pressed by user in unTill POS for given request
	 */
	boolean isCancelRequested(String requestGuid);

	/**
	 * Shows message in unTill POS progress dialog
	 * @param requestGuid Request GUID
	 * @param message Message to show in request's progress dialog
	 */
	void showProgressMessage(String requestGuid, String message);

}
