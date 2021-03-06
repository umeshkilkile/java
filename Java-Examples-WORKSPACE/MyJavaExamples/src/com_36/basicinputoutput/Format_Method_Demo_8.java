package com_36.basicinputoutput;

public class Format_Method_Demo_8 {
	public static void main(String[] args) {
		int i = 2;
		double r = Math.sqrt(i);

		System.out.format("The square root of %d is %f.%n", i, r);
	}
}

/*
 * The three conversions used here are:
 * 
 * d formats an integer value as a decimal value. f formats a floating point
 * value as a decimal value. n outputs a platform-specific line terminator. Here
 * are some other conversions:
 * 
 * x formats an integer as a hexadecimal value. s formats any value as a string.
 * tB formats an integer as a locale-specific month name.
 */