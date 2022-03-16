package com.untill.driver.interfaces.posprinter;

/**
 * Class is responsible for print
 */
public class PosPrinterPrintRequest extends PosPrinterRequest {

	/**
	 * Script with ticket text and print commands
	 */
	private String script;
	/**
	 * Ticket width
	 */
	private int ticketWidth;
	/**
	 * Footer text
	 */
	private String footerText;
	/**
	 * Flag is responsible for footer highlighting
	 */
	private boolean footerHighlighted;

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public int getTicketWidth() {
		return ticketWidth;
	}

	public void setTicketWidth(int ticketWidth) {
		this.ticketWidth = ticketWidth;
	}

	public String getFooterText() {
		return footerText;
	}

	public void setFooterText(String footerText) {
		this.footerText = footerText;
	}

	public boolean isFooterHighlighted() {
		return footerHighlighted;
	}

	public void setFooterHighlighted(boolean footerHighlighted) {
		this.footerHighlighted = footerHighlighted;
	}

	@Override
	public String toString() {
		return "PosPrinterPrintRequest{"
				+ "script='" + script + '\''
				+ ", ticketWidth=" + ticketWidth
				+ ", footerText='" + footerText + '\''
				+ ", footerHighlighted=" + footerHighlighted
				+ "} " + super.toString();
	}
}
