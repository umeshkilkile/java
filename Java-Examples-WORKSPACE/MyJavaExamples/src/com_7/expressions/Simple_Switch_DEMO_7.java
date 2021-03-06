package com_7.expressions;

public class Simple_Switch_DEMO_7 {
	public static void main(String[] args) {

		/*
		 * month is an expression that produces an integral value. The switch
		 * compares the result of month to each case value. If it finds a match,
		 * the corresponding statement (a single statement or multiple
		 * statements; braces are not required) executes. If no match occurs,
		 * the default statement executes.
		 */
		int month = 4;
		String monthString;
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid month";
			/*
			 * You could put a break at the end of the default statement with no
			 * harm if you considered it important for style�s sake.
			 */
			break;
		}
		System.out.println(monthString);
	}
}
