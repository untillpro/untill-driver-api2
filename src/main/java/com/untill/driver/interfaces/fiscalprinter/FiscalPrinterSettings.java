package com.untill.driver.interfaces.fiscalprinter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * An instance of this class returned by {@link IFiscalPrinter#getSettings()} to specify some details of driver behavior
 *
 * @see IFiscalPrinter
 */
public class FiscalPrinterSettings {

	/**
	 * Supported Z-report kinds printed by dates. Each map entry, key is report kind, value is report name.
	 */
	private Map<String, String> zReportByDatesKinds = new LinkedHashMap<>();

	public Map<String, String> getZReportByDatesKinds() {
		return zReportByDatesKinds;
	}

	public void setZReportByDatesKinds(Map<String, String> zReportByDatesKinds) {
		this.zReportByDatesKinds = zReportByDatesKinds;
	}

	@Override
	public String toString() {
		return "FiscalPrinterSettings{"
				+ "zReportByDatesKinds=" + zReportByDatesKinds
				+ '}';
	}

	/**
	 * A builder for {@link FiscalPrinterSettings}
	 */
	public static class Builder {

		private FiscalPrinterSettings settings = new FiscalPrinterSettings();

		public Builder() {
		}

		public Builder putZReportByDatesKind(String kind, String name) {
			settings.getZReportByDatesKinds().put(kind, name);
			return this;
		}

		public FiscalPrinterSettings build() {
			return settings;
		}
	}
}
