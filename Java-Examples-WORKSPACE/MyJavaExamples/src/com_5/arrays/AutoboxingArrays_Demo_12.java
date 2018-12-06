package com_5.arrays;

import java.util.Arrays;

public class AutoboxingArrays_Demo_12 {
	public static void main(String[] args) {
		// Autoboxing:
		Integer[][] a = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
				{ 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 }, { 71, 72, 73, 74, 75, 76, 77, 78, 79, 80 }, };
		System.out.println(Arrays.deepToString(a));
	}
}
/*
 * Autoboxing also works with array initializers
 */