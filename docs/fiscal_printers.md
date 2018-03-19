# Fiscal Printer - IFiscalPrinter

Drivers of this interface handles connection to fiscal printers and fiscal registrators. There are 3 methods in `IFiscalPrinter`:

- `print` - called when either bill paid or re-opened. Takes `FiscalPrintRequest` as an argument with all the information about bill passed. 
- `zReport` - called when z-report is printed.
- `operation` - called in some other cases. An operation defined by the type of `request` (2nd argument):
  - `FiscalOpenDrawerRequest` - drawer opened
  - `FiscalReprintRequest` - bill re-printed
  - `FiscalTestPrintRequest` - test print executed
  - `FiscalXReportRequest` - X-report printed
  - `FiscalZReportsByDatesRequest` - Z-reports by date range requested
  - `FiscalZReportsByNumbersRequest` - Z-reports by number range requested
  - `NonFiscalPrintRequest` - non-fiscal print requested
