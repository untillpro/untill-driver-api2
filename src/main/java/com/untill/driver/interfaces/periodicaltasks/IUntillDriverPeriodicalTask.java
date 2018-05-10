package com.untill.driver.interfaces.periodicaltasks;

/**
 * Driver periodical task interface
 * 
 * @see IHasPeriodicalTasks
 */
public interface IUntillDriverPeriodicalTask {

	/**
	 * Called when periodical task initialized
	 */
	void init();

	/**
	 * @return Returns execution interval, in seconds
	 */
	int getIntervalInSeconds();

	/**
	 * Called when periodical task needs to be executed
	 */
	void execute();

	/**
	 * Called when periodical task finalized
	 */
	void finit();
}
