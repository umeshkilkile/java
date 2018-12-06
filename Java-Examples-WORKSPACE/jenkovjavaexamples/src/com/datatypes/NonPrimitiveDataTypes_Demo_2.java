package com.datatypes;

public class NonPrimitiveDataTypes_Demo_2 {
	public static void main(String[] args) {
		Byte b = 127;
		Byte b1 = -128;
		System.out.println("b = " + b + " , b1 = " + b1);

		/*
		 * Unresolved compilation problem: Type mismatch: cannot convert from
		 * int to Byte
		 */
		// Byte b3 = 128;
		// Byte b5 = -129;

		// Cannot cast from int to Byte
		// Byte b4 = (Byte) 128;
		// Byte b5 = (Byte) 129;
		// Byte b6 = (Byte) 256;
		// Byte b7 = (Byte) 257;

		/*
		 * When you declare an object reference variable, the reference does not
		 * point to any object. You need to create (instantiate) an object
		 * first. Here is how that is done:
		 */
		Integer myInteger;
		// The local variable myInteger may not have been initialized
		// System.out.println(myInteger);
		myInteger = new Integer(45);
		System.out.println(myInteger);

		/*
		 * The variable that references the object can be made to point to
		 * another object though.
		 */
		Integer myInteger2 = new Integer(45);
		System.out.println("myInteger2 = " + myInteger2);
		myInteger2 = new Integer(33);
		System.out.println("myInteger2 = " + myInteger2);

		/*
		 * If you try to convert null to a primitive value you will get a
		 * NullPointerException
		 */
		Integer myInteger3 = null;
		int myInt = myInteger3;
		System.out.println(myInt);
	}
}
