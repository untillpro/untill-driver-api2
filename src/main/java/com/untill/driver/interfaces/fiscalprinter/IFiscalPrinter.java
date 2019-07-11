package com.untill.driver.interfaces.fiscalprinter;

import com.untill.driver.IDriver;
import com.untill.driver.interfaces.IDriverInterface;
import com.untill.driver.params.DriverConfiguration;

/**
 * Fiscal Printer Driver Interface
 * @see IDriverInterface
 * @see IDriver
 */
public interface IFiscalPrinter extends IDriverInterface {

	/**
	 * Called when fiscal document (bill) is printed
	 * 
	 * @param cfg
	 *            Driver configuration
	 * @param request
	 *            print request
	 *
	 * @return instance of {@link FiscalPrinterResult}
	 * @see FiscalPrintResult
	 * @see FiscalPrintRequest
	 * @see DriverConfiguration
	 */
	FiscalPrintResult print(DriverConfiguration cfg, FiscalPrintRequest request);

	/**
	 * Called when user clicks "Print Z-report"
	 * 
	 * @param cfg
	 *            Driver configuration
	 * @param request
	 *            Printing parameters
	 *
	 * @return Instance of {@link FiscalZReportResult}
	 * @see DriverConfiguration
	 * @see FiscalZReportRequest
	 * @see FiscalZReportResult
	 */
	FiscalZReportResult zReport(DriverConfiguration cfg, FiscalZReportRequest request);

	/**
	 * Handles custom fiscal printer operation. Operation is defined by
	 * a type of request argument: {@link FiscalReprintRequest}, {@link NonFiscalPrintRequest},
	 * {@link FiscalTestPrintRequest} etc.
	 * Throwing exception shows POS error.
	 * 
	 * @param cfg			Driver instance configuration
	 * @param request       Operation request
	 * @return Returns either null or some user defined data in {@link FiscalOperationResult}, when required
	 * @see FiscalOperationRequest
	 * @see DriverConfiguration
	 * 
	 */
	FiscalOperationResult operation(DriverConfiguration cfg, FiscalOperationRequest request);

}
