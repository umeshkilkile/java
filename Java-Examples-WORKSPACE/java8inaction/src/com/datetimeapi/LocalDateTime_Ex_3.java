package com.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/*
 * The composite class called LocalDateTime pairs a LocalDate and a LocalTime. It represents both
	a date and a time, without a time zone, and can be created either directly or by combining a date
	and time
 */
public class LocalDateTime_Ex_3 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2018, 2, 9); // YYYYMMDD
		LocalTime time = LocalTime.of(13, 45, 20); // 13:45:20

		// 2014-03-18T13:45:20
		LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
		LocalDateTime dt2 = LocalDateTime.of(date, time);
		LocalDateTime dt3 = date.atTime(13, 45, 20);
		LocalDateTime dt4 = date.atTime(time);
		LocalDateTime dt5 = time.atDate(date);

		System.out.println("dt1 = " + dt1);
		System.out.println("dt2 = " + dt2);
		System.out.println("dt3 = " + dt3);
		System.out.println("dt4 = " + dt4);
		System.out.println("dt5 = " + dt5);

		LocalDate localDate = dt1.toLocalDate();
		LocalTime localTime = dt1.toLocalTime();
		System.out.println("localDate = " + localDate);
		System.out.println("localTime = " + localTime);
	}
}
