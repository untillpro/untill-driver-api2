package com.untill.driver.interfaces.periodicaltasks;

import java.util.List;

import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * 
 * Driver implements this interface when it needs to execute periodical tasks
 * @see IDriverInterface
 */
public interface IHasPeriodicalTasks extends IDriverInterface {

	/**
	 * @param params Driver Configuration
	 * @return Returns the list of periodical tasks for this interface
	 */
	List<IUntillDriverPeriodicalTask> getPeriodicalTasks(DriverConfiguration params);

}
