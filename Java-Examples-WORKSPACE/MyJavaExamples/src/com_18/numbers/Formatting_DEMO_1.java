package com_18.numbers;

import java.util.Date;
import java.util.Locale;

public class Formatting_DEMO_1 {
	public static void main(String[] args) {
		float floatVar = 100.56F;
		int intVar = 100;
		String stringVar = "Umesh";
		System.out.format("The value of " + "the float variable is " + "%f, while the value of the "
				+ "integer variable is %d, " + "and the string is %s", floatVar, intVar, stringVar);
		System.out.println();

		int i = 461012;
		System.out.format("The value of i is: %d%n", i);
		System.out.println();

		System.out.format(
				Locale.FRANCE, "The value of the float " + "variable is %f, while the "
						+ "value of the integer variable " + "is %d, and the string is %s%n",
				floatVar, intVar, stringVar);

		int d = 100;
		System.out.format("int value %d : ", d);// A decimal integer.

		System.out.format("%n");// A new line character appropriate to the
								// platform running the application. You should
								// always use %n, rather than \n.

		float f = 100.10f;
		System.out.format("float value %f : ", f);// A float.

		System.out.format("%n");

		Date date = new Date();
		System.out.format("Month : %tB", date);// A date & time
												// conversion�locale-specific
												// full name of month.
		System.out.format("%n");
		System.out.format("%td, %te", date, date);// A date & time
													// conversion�2-digit day of
													// month. td has leading
													// zeroes as needed, te does
													// not.
		System.out.format("%n");
		System.out.format("%ty, %tY", date, date);// A date & time conversion�ty
													// = 2-digit year, tY =
													// 4-digit year.
		System.out.format("%n");
		System.out.format("%tl", date);// A date & time conversion�hour in
										// 12-hour clock.
		System.out.format("%n");
		System.out.format("%tM", date);// A date & time conversion�minutes in 2
										// digits, with leading zeroes as
										// necessary.
		System.out.format("%n");
		System.out.format("%tp", date);// A date & time
										// conversion�locale-specific am/pm
										// (lower case).
		System.out.format("%n");
		System.out.format("%tm", date);// A date & time conversion�months in 2
										// digits, with leading zeroes as
										// necessary.
		System.out.format("%n");
		System.out.format("%tD", date);// A date & time conversion�date as
										// %tm%td%ty
	}
}
