package com.arrays;

/*
 * The example first sets the minVal to Integer.MAX_VALUE which is the highest possible value an int can take. This is done to make sure that the initial value is not by accident smaller than the smallest value in the array.

Second, the example iterates through the array and compares each value to minValue. If the element in the array is smaller than minVal then minVal is set to the value of the element.

Finally the minimum value found in the array is printed out. In the example above the minimum value is 0.
 */
public class FindMinMaxInArray_Demo_6 {
	public static void main(String[] args) {
		int[] ints = { 0, 2, 4, 6, 8, 10 };

		int minVal = Integer.MAX_VALUE;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] < minVal) {
				minVal = ints[i];
			}
		}
		System.out.println("minVal = " + minVal);

		int maxVal = Integer.MIN_VALUE;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > maxVal) {
				maxVal = ints[i];
			}
		}
		System.out.println("maxVal = " + maxVal);

	}
}
