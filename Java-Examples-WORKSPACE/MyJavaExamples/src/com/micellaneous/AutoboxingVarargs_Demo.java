package com.micellaneous;

public class AutoboxingVarargs_Demo {
	public static void f(Integer... args) {
		for (Integer i : args)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		/*
		 * Notice that you can mix the types together in a single argument list,
		 * and autoboxing selectively promotes the int arguments to Integer.
		 */
		f(new Integer(1), new Integer(2));
		f(4, 5, 6, 7, 8, 9);
		f(10, new Integer(11), 12);
	}
}
