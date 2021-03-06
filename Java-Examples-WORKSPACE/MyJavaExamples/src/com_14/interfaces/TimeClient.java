package com_14.interfaces;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface TimeClient {
	void setTime(int hour, int minute, int second);

	void setDate(int day, int month, int year);

	void setDateAndTime(int day, int month, int year, int hour, int minute,
			int second);

	LocalDateTime getLocalDateTime();

	/*
	 * static methods makes it easier for you to organize helper methods in your
	 * libraries; you can keep static methods specific to an interface in the
	 * same interface rather than in a separate class
	 */
	static ZoneId getZoneId(String zoneString) {
		try {
			return ZoneId.of(zoneString);
		} catch (DateTimeException e) {
			System.err.println("Invalid time zone: " + zoneString
					+ "; using default time zone instead.");
			return ZoneId.systemDefault();
		}
	}

	/*
	 * Default methods enable you to add new functionality to existing
	 * interfaces and ensure binary compatibility with code written for older
	 * versions of those interfaces
	 */
	default ZonedDateTime getZonedDateTime(String zoneString) {
		System.out.println("TimeClient.getZonedDateTime()-zoneString : "
				+ zoneString);
		return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
	}
}
