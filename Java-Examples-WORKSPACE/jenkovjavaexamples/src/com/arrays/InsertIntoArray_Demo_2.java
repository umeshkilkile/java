package com.arrays;

import java.util.Arrays;

/*
 * The example first creates an array. Then it defines an insert index and a new value to insert. Then all elements from the insertion index and to the end of the array are shifted one index down in the array. Note that this will shift the last value in the array out of the array (it will simply be deleted).
 */
public class InsertIntoArray_Demo_2 {
	public static void main(String[] args) {
		int[] ints = new int[20];

		int insertIndex = 10;
		int newValue = 123;

		// move elements below insertion point.
		for (int i = ints.length - 1; i > insertIndex; i--) {
			ints[i] = ints[i - 1];
		}

		// insert new value
		ints[insertIndex] = newValue;

		System.out.println(Arrays.toString(ints));
	}
}
