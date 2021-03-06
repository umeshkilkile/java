package com.innerclasses;

//Returning an instance of an anonymous inner class.
public class Parcel7_Demo_10 {
	public Contents contents() {
		/*
		 * In the anonymous inner class, Contents is created by using a default
		 * constructor.
		 */
		return new Contents() { // Insert a class definition
			private int i = 11;

			@Override
			public int value() {
				return i;
			}
		}; // Semicolon required in this case
	}

	public static void main(String[] args) {
		Parcel7_Demo_10 p = new Parcel7_Demo_10();
		Contents c = p.contents();
		int val = c.value();
		System.out.println(val);
	}
}
/*
 * - The contents( ) method combines the creation of the return value with the
 * definition of the class that represents that return value! In addition, the
 * class is anonymous; it has no name.
 * 
 * - What this strange syntax means is
 * "Create an object of an anonymous class that�s inherited from Contents." The
 * reference returned by the new expression is automatically upcast to a
 * Contents reference.
 */