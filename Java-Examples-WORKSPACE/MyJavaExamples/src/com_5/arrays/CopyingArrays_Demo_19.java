package com_5.arrays;

import java.util.Arrays;

public class CopyingArrays_Demo_19 {
	public static void main(String[] args) {
		int[] i = new int[7];
		int[] j = new int[10];
		Arrays.fill(i, 47);
		Arrays.fill(j, 99);
		System.out.println("i = " + Arrays.toString(i));
		System.out.println("j = " + Arrays.toString(j));
		System.arraycopy(i, 0, j, 0, i.length);
		System.out.println("j = " + Arrays.toString(j));

		int[] k = new int[5];
		Arrays.fill(k, 103);
		System.arraycopy(i, 0, k, 0, k.length);
		System.out.println("k = " + Arrays.toString(k));

		Arrays.fill(k, 103);
		System.arraycopy(k, 0, i, 0, k.length);
		System.out.println("i = " + Arrays.toString(i));

		// Objects:
		Integer[] u = new Integer[10];
		Integer[] v = new Integer[5];
		Arrays.fill(u, new Integer(47));
		Arrays.fill(v, new Integer(99));
		System.out.println("u = " + Arrays.toString(u));
		System.out.println("v = " + Arrays.toString(v));
		System.arraycopy(v, 0, u, u.length / 2, v.length);
		System.out.println("u = " + Arrays.toString(u));
	}
}
/*
 * Copying an array
 * 
 * - The Java standard library provides a static method, System.arraycopy( ),
 * which can copy arrays far more quickly than if you use a for loop to perform
 * the copy by hand. System.arraycopy ) is overloaded to handle all types.
 * 
 * - The example shows that both primitive arrays and object arrays can be
 * copied. However, if you copy arrays of objects, then only the references get
 * copied—there’s no duplication of the objects themselves. This is called a
 * shallow copy
 */