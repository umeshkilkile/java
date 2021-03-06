package com.arrays;

import java.util.Arrays;

/*
 * - If no element is found with the given value, a negative number will be returned. 
 * - The negative number will be the index at which the searched element would be inserted, and then minus one.
 * 
 * -  E.g.,
 * 		The number 7 is not found in the array. The number 7 should have been inserted into the array at index 4, if 7 was to be inserted into the array (and the sort order kept). Therefore binarySearch() returns -4 - 1 = -5 .
 */
public class SearchingArrays_Demo_9 {
	public static void main(String[] args) {
		int[] ints = { 0, 2, 4, 5, 8, 10 };
		int index = Arrays.binarySearch(ints, 7);
		System.out.println("index = " + index);

		/*
		 * - If all elements in the array are smaller than the sought value,
		 * then binarySearch() will return - length of the array - 1.
		 * 
		 * - in this example we search for 12 in the array, but all elements in
		 * the array are smaller than 12. Therefore binarySearch() will return
		 * -length (-6) - 1 = -6 -1 = -7
		 * 
		 */
		int index2 = Arrays.binarySearch(ints, 12);
		System.out.println("index2 = " + index2);
		
		// What if not sorted array
		int[] ints2 = { 0, 3, 2, 4, 5, 8, 10 };
		int index3 = Arrays.binarySearch(ints2, 2);
		System.out.println("index3 = " + index3);
	}
}
