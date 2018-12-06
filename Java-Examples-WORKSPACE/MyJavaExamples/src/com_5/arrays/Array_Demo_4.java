package com_5.arrays;

public class Array_Demo_4 {
	public static void main(String[] args) {
		/*
		 * compiler guarantees initialization because it zeroes the memory for
		 * that array.
		 */
		int[] array = new int[10];
		System.out.println(array[0]);

		/*
		 * When you create an array of objects, you are really creating an array
		 * of references, and each of those references is automatically
		 * initialized to a special value with its own keyword: null.
		 */
		String[] strArr = new String[10];
		System.out.println(strArr[0]);
	}
}
