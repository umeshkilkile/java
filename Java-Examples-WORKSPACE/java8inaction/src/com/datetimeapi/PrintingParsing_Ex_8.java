package com.datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class PrintingParsing_Ex_8 {
	public static void main(String[] args) {
		// Formatting
		LocalDate date = LocalDate.of(2014, 3, 18);
		String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("date = " + date);
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		// You can also parse a String representing a date or a time in that
		// format to re-create the date object itself.
		LocalDate date1 = LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate date2 = LocalDate.parse("2014-03-18", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);

		// Creating a DateTimeFormatter from a pattern
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date3 = LocalDate.of(2014, 3, 18);
		String formattedDate = date1.format(formatter);
		System.out.println("formattedDate = " + formattedDate);
		LocalDate date4 = LocalDate.parse(formattedDate, formatter);
		System.out.println("date3 = " + date3);
		System.out.println("date4 = " + date4);

		// Creating a localized DateTimeFormatter
		DateTimeFormatter italianFormatter = DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
		LocalDate date5 = LocalDate.of(2014, 3, 18);
		String formattedDate2 = date.format(italianFormatter); // 18. marzo 2014
		System.out.println("formattedDate2 = " + formattedDate2);
		LocalDate date6 = LocalDate.parse(formattedDate2, italianFormatter);
		System.out.println("date6 = " + date6);

		// Building a DateTimeFormatter
		DateTimeFormatter italianFormatter2 = new DateTimeFormatterBuilder().appendText(ChronoField.DAY_OF_MONTH)
				.appendLiteral(". ").appendText(ChronoField.MONTH_OF_YEAR).appendLiteral(" ")
				.appendText(ChronoField.YEAR).parseCaseInsensitive().toFormatter(Locale.ITALIAN);
		String formattedDate3 = date5.format(italianFormatter2); // 18. marzo 2014
		System.out.println("formattedDate3 = " + formattedDate3);
	}
}
/*
 * In comparison to the old java.util.DateFormat class, all the
 * DateTimeFormatter instances are thread-safe.
 */
