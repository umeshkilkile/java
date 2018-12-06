package com_6.operators;
/*
    The Arithmetic Operators
    
		+ additive operator (also used for String concatenation)
		- subtraction operator
		* multiplication operator
		/ division operator
		% remainder operator
	
 */
public class ArithmeticOperators_DEMO_1 {
	public static void main(String[] args) {

		// result is now 3
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);

		// result is now 2
		result = result - 1;
		System.out.println("3 - 1 = " + result);

		// result is now 4
		result = result * 2;
		System.out.println("2 * 2 = " + result);

		// result is now 2
		result = result / 2;
		System.out.println("10 / 7 = " + (10 / 7));

		// result is now 10
		result = result + 8;

		// result is now 3
		result = result % 7;
		System.out.println("10 % 7 = " + result);
		
		int i1 = 10;
		int n1 = i1++ % 5;
		
		System.out.println("i1 = " + i1);
		System.out.println("n1 = " + n1);
		
		int m1 = i1++ / 5;
		System.out.println("i1 = " + i1);
		System.out.println("m1 = " + m1);
		
		int i2 = 10;
		int n2 = ++i2 % 5;
		
		System.out.println("i2 = " + i2);
		System.out.println("n2 = " + n2);
		
		int m2 = ++i2 / 5;
		System.out.println("i2 = " + i2);
		System.out.println("m2 = " + m2);
		
	}
}
