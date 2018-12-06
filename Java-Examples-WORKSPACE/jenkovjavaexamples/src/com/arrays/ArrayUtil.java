package com.arrays;

import java.util.Arrays;

public class ArrayUtil {
	public static void insertIntoArray(int[] array, int insertIndex, int newValue) {
		// move elements below insertion point.
		for (int i = array.length - 1; i > insertIndex; i--) {
			array[i] = array[i - 1];
		}

		// insert new value
		array[insertIndex] = newValue;
		System.out.println(Arrays.toString(array));
	}

	public static void removeFromArray(int[] array, int removeIndex) {
		for (int i = removeIndex; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
	}

	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
