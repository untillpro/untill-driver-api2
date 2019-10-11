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
	
	/**
	 * Displays query in unTill POS progress dialog expecting some user input
	 * @param requestGuid Request GUID
	 * @param id Query ID. If the same request assumes several queries, different IDs must be used to avoid conflicts
	 * @param kind Query kind, see {@link ProgressQueryType}
	 * @param title Title shown in POS
	 */
	void showQuery(String requestGuid, int id, ProgressQueryType kind, String title);
	
	/**
	 * @param requestGuid Request GUID
	 * @param id Query ID
	 * @return Returns result of a query, or <b>null</b> if result is not yet defined
	 */
	String getQueryResult(String requestGuid, int id);

}
