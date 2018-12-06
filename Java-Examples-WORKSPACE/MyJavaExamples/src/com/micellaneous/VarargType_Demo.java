package com.micellaneous;

public class VarargType_Demo {
	static void f(Character... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}

	static void g(int... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}

	public static void main(String[] args) {
		f('a', 't');
		f();
		g(1);
		g();
		System.out.println("int[]: " + new int[0].getClass());
	}
}
/*
 * The leading ‘[‘ indicates (in output) that this is an array of the type that
 * follows. The ‘I’ is for a primitive int; to double-check, I created an array
 * of int in the last line and printed its type. This verifies that using
 * varargs does not depend on autoboxing, but that it actually uses the
 * primitive types.
 */
