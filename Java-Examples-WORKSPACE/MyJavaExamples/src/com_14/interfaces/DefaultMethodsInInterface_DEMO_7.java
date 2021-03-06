package com_14.interfaces;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DefaultMethodsInInterface_DEMO_7 implements TimeClient {

	private LocalDateTime dateAndTime;

	public DefaultMethodsInInterface_DEMO_7() {
		dateAndTime = LocalDateTime.now();
	}

	public void setTime(int hour, int minute, int second) {
		LocalDate currentDate = LocalDate.from(dateAndTime);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(currentDate, timeToSet);
	}

	public void setDate(int day, int month, int year) {
		LocalDate dateToSet = LocalDate.of(day, month, year);
		LocalTime currentTime = LocalTime.from(dateAndTime);
		dateAndTime = LocalDateTime.of(dateToSet, currentTime);
	}

	public void setDateAndTime(int day, int month, int year, int hour,
			int minute, int second) {
		LocalDate dateToSet = LocalDate.of(day, month, year);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
	}

	public LocalDateTime getLocalDateTime() {
		return dateAndTime;
	}

	public String toString() {
		return dateAndTime.toString();
	}

	public static void main(String... args) {
		TimeClient myTimeClient = new DefaultMethodsInInterface_DEMO_7();
		System.out.println("Current time: " + myTimeClient.toString());
		System.out.println("Time in California: "
				+ myTimeClient.getZonedDateTime("Blah blah").toString());
		
		//Calling a static method in an interface
		System.out.println(TimeClient.getZoneId("USA"));
	}

}
