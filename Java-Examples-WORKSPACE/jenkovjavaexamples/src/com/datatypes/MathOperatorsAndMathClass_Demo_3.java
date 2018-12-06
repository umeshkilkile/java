package com.datatypes;

public class MathOperatorsAndMathClass_Demo_3 {
	public static void main(String[] args) {
		/*
		 * A commonly used math operation on variables is to set the variable
		 * equal to its own value plus another value
		 */
		int result = 10;
		result = result + 20;
		System.out.println(result);

		// The same can be done using += operator
		int result2 = 10;
		result2 += 20;
		System.out.println(result2);

		int diff = 200 - 10 - 20;
		System.out.println("diff = " + diff);

		int diff2 = 200 - (-10);
		System.out.println("diff2 = " + diff2);

		int division = 100 / 10 / 2;
		System.out.println(division);

		int division2 = 100 / (10 / 2);
		System.out.println("division2 = " + division2);

		// Remainder / Modulo
		int value = 100;
		int remainder = value % 9;
		System.out.println("remainder = " + remainder);

		/*
		 * - Java has a way to force all numbers in a calculation to be floating
		 * point variables. You suffix the numbers with either a capital F or D.
		 * 
		 * - Notice the uppercase Ds after each number. This uppercase D tells
		 * Java that these numbers are to be interpreted as floating point
		 * numbers, and thus the division is supposed to be a floating point
		 * division which keeps fractions instead of cutting them off.
		 */
		double result3 = 100D / 8D;
		System.out.println("result3 = " + result3);

	}
}
