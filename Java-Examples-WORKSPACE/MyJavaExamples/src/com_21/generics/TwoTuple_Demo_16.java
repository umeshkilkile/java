package com_21.generics;

/*
 * - This concept is called a tuple, and it is simply a group of objects wrapped together into a single object.
 * 
 * - Tuples can typically be any length, but each object in the tuple can be of a different type.
 */
public class TwoTuple_Demo_16<T, T1> {
	public final T first;
	public final T1 second;

	public TwoTuple_Demo_16(T a, T1 b) {
		first = a;
		second = b;
	}

	public String toString() {
		return "(" + first + ", " + second + ")";
	}

	public static void main(String[] args) {
		TwoTuple_Demo_16<String, Integer> s1 = new TwoTuple_Demo_16<String, Integer>("Hello", 1);
		System.out.println(s1.toString());
	}
}
