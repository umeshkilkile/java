package com.arrays;

public class ArrayDemo1 {
	public static void main(String[] args) {
		String[] stringArray = new String[10];

		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}

		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = "String no " + i;
		}

		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}

		// ---------------------------

		int[] intArray = new int[10];

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
