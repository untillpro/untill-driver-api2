package com.untill.driver.interfaces.hotel;

/**
 * A configuration of "End Of Day" export by {@link IHotelSupportsEndOfDay}
 */
public class EndOfDayConfiguration {

	public static final int DEFAULT_WAIT_TIMEOUT = 90_000;

	private boolean roomPaymentTurnoverIncluded;
	private int waitTimeout = DEFAULT_WAIT_TIMEOUT;

	/**
	 * @return Returns true if EOD includes ROOM-payments turnover
	 */
	public boolean isRoomPaymentTurnoverIncluded() {
		return roomPaymentTurnoverIncluded;
	}

	/**
	 * Sets if EOD includes ROOM-payments turnover or not
	 *
	 * @param roomPaymentTurnoverIncluded true if EOD includes ROOM-payments turnover
	 */
	public void setRoomPaymentTurnoverIncluded(boolean roomPaymentTurnoverIncluded) {
		this.roomPaymentTurnoverIncluded = roomPaymentTurnoverIncluded;
	}

	/**
	 * @return Returns timeout in milliseconds telling how long unTill waits for
	 * an answer from driver before it shows "Timeout" error. Default timeout
	 * is 90000.
	 */
	public int getWaitTimeout() {
		return waitTimeout;
	}

	/**
	 * Sets timeout telling how long unTill waits for an answer
	 * from driver before it shows "Timeout" error
	 *
	 * @param waitTimeout Timeout, in milliseconds
	 */
	public void setWaitTimeout(int waitTimeout) {
		this.waitTimeout = waitTimeout;
	}

	public static class Builder {

		private final EndOfDayConfiguration cfg;

		public Builder() {
			cfg = new EndOfDayConfiguration();
		}

		public Builder setRoomPaymentTurnoverIncluded(boolean roomPaymentTurnoverIncluded) {
			cfg.setRoomPaymentTurnoverIncluded(roomPaymentTurnoverIncluded);
			return this;
		}

		public Builder setWaitTimeout(int waitTimeout) {
			cfg.setWaitTimeout(waitTimeout);
			return this;
		}

		public EndOfDayConfiguration build() {
			return cfg;
		}
	}

	@Override
	public String toString() {
		return "EndOfDayConfiguration{"
				+ "roomPaymentTurnoverIncluded=" + roomPaymentTurnoverIncluded
				+ ", waitTimeout=" + waitTimeout
				+ '}';
	}
}
