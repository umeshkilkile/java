package com.rounddecimalnumbers_7;

import java.text.DecimalFormat;

public class FormatDecimalNumber_1 {
	public static void main(String[] args) {
		double PI = 3.1415;

		System.out.println("PI = " + PI);
		// If we just want to print a decimal number with n digits after decimal
		// point, we can simply format the output String:
		System.out.printf("Value with 3 digits after decimal point %.3f %n", PI);

		// Alternatively, we can format the value with the DecimalFormat class:
		DecimalFormat df = new DecimalFormat("###.###");
		System.out.println(df.format(PI));
	}
}
