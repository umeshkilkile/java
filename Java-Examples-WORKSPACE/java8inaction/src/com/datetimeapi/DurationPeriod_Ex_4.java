package com.datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
 * You can create a duration between two LocalTimes, two LocalDateTimes,or two Instants as follows:
 */
public class DurationPeriod_Ex_4 {
	public static void main(String[] args) {

		/*
		 * Duration class is used to represent an amount of time measured in
		 * seconds and eventually nanoseconds, you can�t pass a LocalDate to the
		 * between method.
		 */

		LocalTime time1 = LocalTime.of(13, 45, 20); // 13:45:20
		LocalTime time2 = LocalTime.parse("23:56:23");
		Duration d1 = Duration.between(time1, time2);
		System.out.println("d1 = " + d1);

		LocalDateTime dateTime1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
		LocalDate date = LocalDate.of(2018, 2, 9);
		LocalDateTime dateTime2 = LocalDateTime.of(date, time1);
		Duration d2 = Duration.between(dateTime1, dateTime2);
		System.out.println("d2 = " + d2);

		Instant instant1 = Instant.ofEpochSecond(3);
		Instant instant2 = Instant.ofEpochSecond(2, 1_000_000_000);
		Duration d3 = Duration.between(instant1, instant2);
		System.out.println("d3 = " + d3);

		/*
		 * When you need to model an amount of time in terms of years, months,
		 * and days, you can use the Period class.
		 */
		Period tenDays = Period.between(LocalDate.of(2014, 3, 8), LocalDate.of(2014, 3, 18));
		System.out.println("tenDays = " + tenDays);

		/*
		 * Creating Durations and Periods
		 */
		Duration threeMinutes = Duration.ofMinutes(3);
		Duration threeMinute = Duration.of(3, ChronoUnit.MINUTES);
		Period tenDay = Period.ofDays(10);
		Period threeWeeks = Period.ofWeeks(3);
		Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);
		
		System.out.println("threeMinutes = " + threeMinutes);
		System.out.println("threeMinute = " + threeMinute);
		System.out.println("tenDay = " + tenDay);
		System.out.println("threeWeeks = " + threeWeeks);
		System.out.println("twoYearsSixMonthsOneDay = " + twoYearsSixMonthsOneDay);
		
	}
}
