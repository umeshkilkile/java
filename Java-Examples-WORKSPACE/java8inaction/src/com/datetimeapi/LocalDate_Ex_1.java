package com.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/*
 * Creating a LocalDate and reading its values
 */
public class LocalDate_Ex_1 {
	public static void main(String[] args) {
		// NOTE : LocalDate.of(YYYY, MM, DD) : 1 is JANUARY and 12 is DECEMBER
		LocalDate date = LocalDate.of(2018, 2, 9);
		int year = date.getYear();
		Month month = date.getMonth();
		int day = date.getDayOfMonth();
		DayOfWeek dow = date.getDayOfWeek();
		int len = date.lengthOfMonth();
		boolean leap = date.isLeapYear();

		System.out.println("date = " + date);
		System.out.println("year = " + year);
		System.out.println("month = " + month);
		System.out.println("day = " + day);
		System.out.println("dow = " + dow);
		System.out.println("len = " + len);
		System.out.println("leap = " + leap);

		/*
		 * To obtains the current date from the system clock using the now
		 * factory method:
		 */
		LocalDate today = LocalDate.now();
		System.out.println("today = " + today);

		/*
		 * Reading LocalDate values using a TemporalField
		 */
		int year1 = today.get(ChronoField.YEAR);
		int month1 = today.get(ChronoField.MONTH_OF_YEAR);
		int day1 = today.get(ChronoField.DAY_OF_MONTH);
		System.out.println("year1 = " + year1);
		System.out.println("month1 = " + month1);
		System.out.println("day1 = " + day1);

		/*
		 * LocalDate can be created by parsing a String representing
		 */
		LocalDate anotherDate = LocalDate.parse("2014-03-18");
		System.out.println("anotherDate = " + anotherDate);
	}
}
