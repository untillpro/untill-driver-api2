package com.untill.driver.interfaces.tables;

public class TableDirtyChangedRequest extends TableChangedRequest {
	/**
	 * The flag is <tt>true</tt> if the <tt>Sales area</tt> setting <tt>Close tables manually</tt> is checked and everything is paid otherwise <tt>false</tt>
	 */
	private boolean dirty;

	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}

	@Override
	public String toString() {
		return "TableDirtyChangedRequest{"
				+ "dirty=" + dirty
				+ "} " + super.toString();
	}
}
