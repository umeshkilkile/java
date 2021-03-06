package com_12.enums;

//enum type can be passed as an argument to switch statement.
public class EnumTest_DEMO_1 {

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	Day day;

	public EnumTest_DEMO_1(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {

		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}

	}

	public static void main(String[] args) {
		EnumTest_DEMO_1 firstDay = new EnumTest_DEMO_1(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumTest_DEMO_1 thirdDay = new EnumTest_DEMO_1(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTest_DEMO_1 fifthDay = new EnumTest_DEMO_1(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest_DEMO_1 sixthDay = new EnumTest_DEMO_1(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumTest_DEMO_1 seventhDay = new EnumTest_DEMO_1(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}
