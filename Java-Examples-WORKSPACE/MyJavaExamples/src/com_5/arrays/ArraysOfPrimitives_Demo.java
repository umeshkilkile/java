package com_5.arrays;

public class ArraysOfPrimitives_Demo {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2;

		/*
		 * Iit’s possible to assign one array to another in Java. What you’re
		 * really doing is copying a reference
		 */
		a2 = a1;
		for (int i = 0; i < a1.length; i++)
			System.out.println("a1[" + i + "] = " + a1[i]);

		for (int i = 0; i < a2.length; i++)
			System.out.println("a2[" + i + "] = " + a2[i]);
		System.out.println("-------------------------");
		/*
		 * changes made via a2 are seen in a1.
		 */
		for (int i = 0; i < a2.length; i++)
			a2[i] = a2[i] + 1;
		for (int i = 0; i < a1.length; i++)
			System.out.println("a1[" + i + "] = " + a1[i]);
	}
}
