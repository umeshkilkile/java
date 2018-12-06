package com_7.expressions;

public class Expression_DEMO_1 {
	public static void main(String[] args) {

		/*
		 * Expressions
		 */
		int x = 10;
		int y = 10;

		int z = x + y / 100; // ambiguous
		System.out.println("z : " + z);

		int a = (x + y) / 100; // unambiguous, recommended
		System.out.println("a : " + a);

		int b = x + (y / 100); // unambiguous, recommended
		System.out.println("b : " + b);

		float x1 = 10;
		float y1 = 10;

		float z1 = x1 + y1 / 100; // ambiguous
		System.out.println("z1 : " + z1);

		float a1 = (x1 + y1) / 100; // unambiguous, recommended
		System.out.println("a1 : " + a1);

		float b1 = x1 + (y1 / 100); // unambiguous, recommended
		System.out.println("b1 : " + b1);

		/*
		 * Statements
		 */
		// assignment statement
		double aValue = 8933.234;
		// increment statement
		aValue++;
		// method invocation statement
		System.out.println("Hello World!");
		// object creation statement
		Bicycle myBike = new Bicycle();
	}
}
