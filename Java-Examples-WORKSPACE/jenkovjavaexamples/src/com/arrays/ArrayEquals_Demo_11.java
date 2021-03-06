package com.arrays;

import java.util.Arrays;

/*
 * - Two arrays are considered equal if the arrays have the same length, and the elements are equal to each other 
 * in the order they are found in the array. 
 * - This example compares the array ints1 to the arrays ints2 and ints3. The first comparison will result in the value true since ints1 and ints2 contains the same elements in the same order. The second comparison will result in the value false. Array ints1 contains the same elements as ints3 but not in the same order. Therefore the two arrays are not considered equal.
 */

public class ArrayEquals_Demo_11 {
	public static void main(String[] args) {
		int[] ints1 = { 0, 2, 4, 6, 8, 10 };
		int[] ints2 = { 0, 2, 4, 6, 8, 10 };
		int[] ints3 = { 10, 8, 6, 4, 2, 0 };

		boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
		boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

		System.out.println(ints1EqualsInts2);
		System.out.println(ints1EqualsInts3);
	}
}
