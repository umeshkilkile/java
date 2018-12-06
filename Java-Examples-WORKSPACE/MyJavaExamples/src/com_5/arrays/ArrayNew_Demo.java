package com_5.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew_Demo {
	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		System.out.println("length of a = " + a.length);
		/*
		 * primitive types are automatically initialized to “empty” values. For
		 * numerics and char, this is zero, and for boolean, it’s false.)
		 */
		System.out.println(Arrays.toString(a));

		double[] d = new double[5];
		System.out.println(Arrays.toString(d));

		char[] c = new char[5];
		System.out.println(Arrays.toString(c));

		boolean[] b = new boolean[2];
		System.out.println(Arrays.toString(b));

		/*
		 * For non-primitive it is null
		 */
		String[] s = new String[10];
		System.out.println(Arrays.toString(s));
	}
}

/*
 * - All arrays have an intrinsic member (whether they’re arrays of objects or
 * arrays of primitives) that you can query—but not change—to tell you how many
 * elements there are in the array. This member is length.
 */
