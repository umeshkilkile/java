package com.arrays;

public class ArraySort_Demo_7 {
	public static void main(String[] args) {
		int[] ints = new int[10];

		for (int i = 0; i < ints.length; i++) {
			ints[i] = 10 - i;
		}

		System.out.println(java.util.Arrays.toString(ints));

		java.util.Arrays.sort(ints);

		System.out.println(java.util.Arrays.toString(ints));
	}
}
