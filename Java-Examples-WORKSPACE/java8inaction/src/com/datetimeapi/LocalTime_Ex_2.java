package com.datetimeapi;

import java.time.LocalTime;

/*
 * Creating a LocalTime and reading its values
 */
public class LocalTime_Ex_2 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.of(13, 45, 20); // 13:45:20
		int hour = time.getHour();
		int minute = time.getMinute();
		int seconds = time.getSecond();
		System.out.println("hour = " + hour);
		System.out.println("minute = " + minute);
		System.out.println("seconds = " + seconds);
		/*
		 * LocalTime can be created by parsing a String representing
		 */
		LocalTime time2 = LocalTime.parse("13:45:20");
		System.out.println("time2 = " + time2.getHour());
	}
}
