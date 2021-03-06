package com.datetimeapi;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Manipulating_Ex_5 {
	public static void main(String[] args) {

		/*
		 * Manipulating the attributes of a LocalDate in an absolute way
		 */
		LocalDate date1 = LocalDate.of(2014, 3, 18);
		LocalDate date2 = date1.withYear(2011);
		LocalDate date3 = date2.withDayOfMonth(25);
		LocalDate date4 = date3.with(ChronoField.MONTH_OF_YEAR, 9);

		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
		System.out.println("date3 = " + date3);
		System.out.println("date4 = " + date4);

		/*
		 * Manipulating the attributes of a LocalDate in a relative way
		 */
		LocalDate date6 = date1.plusWeeks(1);
		LocalDate date7 = date2.minusYears(3);
		LocalDate date8 = date3.plus(6, ChronoUnit.MONTHS);
		System.out.println("date6 = " + date6);
		System.out.println("date7 = " + date7);
		System.out.println("date8 = " + date8);

		LocalDate date = LocalDate.of(2014, 3, 18);
		date = date.with(ChronoField.MONTH_OF_YEAR, 9);
		date = date.plusYears(2).minusDays(10);
		date.withYear(2011);
		System.out.println("date = " + date);
	}
}
