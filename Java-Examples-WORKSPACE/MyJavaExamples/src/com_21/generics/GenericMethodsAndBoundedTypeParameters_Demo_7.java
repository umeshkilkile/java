package com_21.generics;

public class GenericMethodsAndBoundedTypeParameters_Demo_7 {
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray,
			T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}

	public static void main(String[] args) {

		/*
		 * With Integers
		 */
		Integer[] integerArray = new Integer[10];
		for (int i = 0; i < 10; i++) {
			integerArray[i] = i + 100;
		}
		int result = countGreaterThan(integerArray, 102);
		System.out.println(result);
		
		/*
		 * With Float
		 */
		Float[] floatArray = new Float[10];
		for (int i = 0; i < 10; i++) {
			floatArray[i] = (float) (i + 500.10);
		}
		int result2 = countGreaterThan(floatArray, 500.10F);
		System.out.println(result2);

	}
}
