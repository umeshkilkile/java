package com_9.classesandobjects;

public class Covariant_Return_Type_DEMO_15 extends ImaginaryNumber {
	public static void main(String[] args) {
		System.out.println(returnANumber());
	}

	/*
	 * covariant return type, means that the return type is allowed to vary in
	 * the same direction as the subclass.
	 */
	public static ImaginaryNumber returnANumber() {
		return null;
	}

	/*
	 * The returnANumber method can return an ImaginaryNumber but not an Object.
	 * ImaginaryNumber is a Number because it's a subclass of Number. However,
	 * an Object is not necessarily a Number — it could be a String or another
	 * type.
	 */
	/*
	 * public static Object returnANumber() { return null; }
	 */

	/**
	 * Note: You also can use interface names as return types. In this case, the
	 * object returned must implement the specified interface.
	 */
}
