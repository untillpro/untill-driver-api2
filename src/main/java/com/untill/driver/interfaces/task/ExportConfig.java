package com.untill.driver.interfaces.task;

import java.util.Date;

/**
 * Class describes <tt>Export target</tt> in unTill BO
 */
public class ExportConfig {
	/**
	 * Output directory
	 */
	private String dir;
	/**
	 * Filename
	 */
	private String filename;
	/**
	 * From timestamp
	 */
	private Date from;
	/**
	 * Till timestamp
	 */
	private Date till;
	/**
	 * Export number
	 */
	private int number;
	/**
	 * Format: <tt>CSV</tt>, <tt>XML</tt>, <tt>HTML</tt>, <tt>XLS</tt>, <tt>PDF</tt>
	 */
	private String format;
	/**
	 * Extension: <tt>txt</tt>, <tt>csv</tt>
	 */
	private String extension;
	/**
	 * Field separator e.g. <b>;</b>
	 */
	private String fieldSeparator;
	/**
	 * Fixed size
	 */
	private boolean fixedSize;
	/**
	 * Decimal separator e.g. <b>,</b>
	 */
	private String decimalSeparator;
	/**
	 * Use system locale decimal separator
	 */
	private boolean useSystemLocale;
	/**
	 * Line separator: <tt>CR LF</tt>, <tt>CR</tt>, <tt>Export at single line</tt>
	 */
	private String lineSeparator;
	/**
	 * Code page e.g. 65001
	 */
	private int codepage;
	/**
	 * Always add quotes
	 */
	private boolean alwaysAddQuotes;

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTill() {
		return till;
	}

	public void setTill(Date till) {
		this.till = till;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getFieldSeparator() {
		return fieldSeparator;
	}

	public void setFieldSeparator(String fieldSeparator) {
		this.fieldSeparator = fieldSeparator;
	}

	public boolean isFixedSize() {
		return fixedSize;
	}

	public void setFixedSize(boolean fixedSize) {
		this.fixedSize = fixedSize;
	}

	public String getDecimalSeparator() {
		return decimalSeparator;
	}

	public void setDecimalSeparator(String decimalSeparator) {
		this.decimalSeparator = decimalSeparator;
	}

	public boolean isUseSystemLocale() {
		return useSystemLocale;
	}

	public void setUseSystemLocale(boolean useSystemLocale) {
		this.useSystemLocale = useSystemLocale;
	}

	public String getLineSeparator() {
		return lineSeparator;
	}

	public void setLineSeparator(String lineSeparator) {
		this.lineSeparator = lineSeparator;
	}

	public int getCodepage() {
		return codepage;
	}

	public void setCodepage(int codepage) {
		this.codepage = codepage;
	}

	public boolean isAlwaysAddQuotes() {
		return alwaysAddQuotes;
	}

	public void setAlwaysAddQuotes(boolean alwaysAddQuotes) {
		this.alwaysAddQuotes = alwaysAddQuotes;
	}
}
