package com_21.generics;

/*
 * The longer-length tuples can be created with inheritance. You can see that
 * adding more type parameters is a simple matter:
 */
public class ThreeTuple_Demo_17<A, B, C> extends TwoTuple_Demo_16<A, B> {
	public final C third;

	public ThreeTuple_Demo_17(A a, B b, C c) {
		super(a, b);
		third = c;
	}

	public String toString() {
		return "(" + first + ", " + second + ", " + third + ")";
	}

	public static void main(String[] args) {
		ThreeTuple_Demo_17<String, Integer, Automobile> s1 = new ThreeTuple_Demo_17<String, Integer, Automobile>(
				"Hello", 1, new Automobile());
		System.out.println(s1.toString());
	}
}
