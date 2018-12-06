package com.comp;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo_2 {
	public static void main(String[] args) {
		ZoneId london = ZoneId.of("Asia/Kolkata");
		LocalDate april9 = LocalDate.of(2017, Month.APRIL, 9);
		LocalTime early = LocalTime.parse("08:45");
		ZonedDateTime flightDeparture = ZonedDateTime.of(april9, early,london);
		System.out.println(flightDeparture);
		
		LocalTime from = LocalTime.from(flightDeparture);
		System.out.println(from);
		
		ZonedDateTime touchDown = ZonedDateTime.of(april9, LocalTime.of(11, 35),ZoneId.of("Europe/Paris"));
		
		Duration flightLength = Duration.between(flightDeparture, touchDown);
		System.out.println(flightLength);
		
		//How long have I been in continental Europe?
		ZonedDateTime now = ZonedDateTime.now();
		Duration timeHere = Duration.between(touchDown, now);
		System.out.println(timeHere);
	}
}
