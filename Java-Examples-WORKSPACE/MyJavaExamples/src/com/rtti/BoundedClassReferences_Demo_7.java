package com.rtti;

/*
 * In order to create a Class reference that is constrained to a type or any
 * subtype, you combine the wildcard with the extends keyword to create a bound.
 * So instead of just saying Class<Number>, you say:
 */
public class BoundedClassReferences_Demo_7 {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		System.out.println(bounded.getName());

		bounded = double.class;
		System.out.println(bounded.getName());

		bounded = Number.class;
		System.out.println(bounded.getName());
		// Or anything else derived from Number.
	}
}
