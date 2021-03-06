package com_9.classesandobjects;

/**
 * 1. You use varargs when you don't know how many of a particular type of
 * argument will be passed to the method.
 * 
 *
 */
public class ArbitraryNumberOfArguments_DEMO_12 {
	public static void main(String[] args) {
		int summation = addAll(1, 2, 3, 4, 5);
		System.out.println(summation);

		int[] values = { 1, 2, 3, 4, 5, 6 };
		int sum2 = addAll(values);
		System.out.println(sum2);
	}

	public static int addAll(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
