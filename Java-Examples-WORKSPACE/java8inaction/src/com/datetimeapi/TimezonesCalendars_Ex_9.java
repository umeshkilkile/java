package com.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.HijrahDate;
import java.time.chrono.IsoChronology;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.TimeZone;

/*
 * Working with different time zones and calendars
 */
public class TimezonesCalendars_Ex_9 {
	public static void main(String[] args) {
		// A specific ZoneId is identified by a region ID,
		ZoneId romeZone = ZoneId.of("Europe/Rome");
		System.out.println("romeZone = " + romeZone);

		// convert an old TimeZone object to a ZoneId by using the new method
		// toZoneId
		ZoneId zoneId = TimeZone.getDefault().toZoneId();
		System.out.println("zoneId = " + zoneId);

		/*
		 * Once you have a ZoneId object, you can combine it with a LocalDate, a
		 * LocalDateTime, or an Instant, to transform it into ZonedDateTime
		 * instances, which represent points in time relative to the specified
		 * time zone
		 */
		LocalDate date = LocalDate.of(2014, Month.MARCH, 18);
		ZonedDateTime zdt1 = date.atStartOfDay(romeZone);
		System.out.println("zdt1 = " + zdt1);

		LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
		ZonedDateTime zdt2 = dateTime.atZone(romeZone);
		System.out.println("zdt2 = " + zdt2);

		Instant instant = Instant.now();
		ZonedDateTime zdt3 = instant.atZone(romeZone);
		System.out.println("zdt3 = " + zdt3);

		// You can also convert a LocalDateTime to an Instant by using a ZoneId:
		/*
		 * LocalDateTime dateTime1 = LocalDateTime.of(2014, Month.MARCH, 18, 13,
		 * 45); Instant instantFromDateTime =
		 * dateTime1.toInstant(ZoneOffset.systemDefault());
		 */

		Instant instant2 = Instant.now();
		LocalDateTime timeFromInstant = LocalDateTime.ofInstant(instant2, romeZone);
		System.out.println("timeFromInstant = " + timeFromInstant);

		// Fixed offset from UTC/Greenwich
		ZoneOffset newYorkOffset = ZoneOffset.of("-05:00");
		LocalDateTime dateTime7 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
		OffsetDateTime dateTimeInNewYork = OffsetDateTime.of(dateTime7, newYorkOffset);
		System.out.println("dateTimeInNewYork = " + dateTimeInNewYork);

		// Using alternative calendar systems
		LocalDate date7 = LocalDate.of(2014, Month.MARCH, 18);
		JapaneseDate japaneseDate = JapaneseDate.from(date7);
		System.out.println("japaneseDate = " + japaneseDate);

		Chronology japaneseChronology = Chronology.ofLocale(Locale.JAPAN);
		ChronoLocalDate now = japaneseChronology.dateNow();
		System.out.println("now = " + now);

		// Islamic calendar
		// Get current Hihrah date; then change it to have the first day of
		// Ramadan, which is the 9th month.
		HijrahDate ramadanDate = HijrahDate.now().with(ChronoField.DAY_OF_MONTH, 1).with(ChronoField.MONTH_OF_YEAR, 9);
		System.out.println("Ramadan starts on " + IsoChronology.INSTANCE.date(ramadanDate) + " and ends on "
				+ IsoChronology.INSTANCE.date(ramadanDate.with(TemporalAdjusters.lastDayOfMonth())));
	}
}
