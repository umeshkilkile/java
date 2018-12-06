package com.innerclasses;

//An anonymous inner class that performs initialization.
public class Parcel9_Demo_13 {
	// Argument must be final to use inside
	// anonymous inner class:
	public Destination destination(String dest) {
		return new Destination() {
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9_Demo_13 p = new Parcel9_Demo_13();
		Destination d = p.destination("Tasmania");
		String dest = d.readLabel();
		System.out.println(dest);
	}
}
/*
 * - If you’re defining an anonymous inner class and want to use an object
 * that’s defined outside the anonymous inner class, the compiler requires that
 * the argument reference be final, as you see in the argument to destination(
 * ). If you forget, you’ll get a compile-time error message.
 */