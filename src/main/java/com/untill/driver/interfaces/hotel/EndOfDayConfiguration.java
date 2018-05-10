package com.untill.driver.interfaces.hotel;

/**
 * A configuration of "End Of Day" export by {@link IHotelSupportsEndOfDay}
 *
 */
public class EndOfDayConfiguration {

	private boolean roomPaymentTurnoverIncluded;

	/**
	 * @return Returns true if EOD includes ROOM-payments turnover
	 */
	public boolean isRoomPaymentTurnoverIncluded() {
		return roomPaymentTurnoverIncluded;
	}

	/**
	 * Sets if EOD includes ROOM-payments turnover or not
	 * 
	 * @param roomPaymentTurnoverIncluded
	 *            true if EOD includes ROOM-payments turnover
	 */
	public void setRoomPaymentTurnoverIncluded(boolean roomPaymentTurnoverIncluded) {
		this.roomPaymentTurnoverIncluded = roomPaymentTurnoverIncluded;
	}

	public static class Builder {
		private EndOfDayConfiguration cfg;

		public Builder() {
			cfg = new EndOfDayConfiguration();
		}

		public Builder setRoomPaymentTurnoverIncluded(boolean roomPaymentTurnoverIncluded) {
			cfg.setRoomPaymentTurnoverIncluded(roomPaymentTurnoverIncluded);
			return this;
		}

		public EndOfDayConfiguration build() {
			return cfg;
		}
	}

}
