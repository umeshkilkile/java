package com_6.operators;

/*
 * - Multiplication and division happen before addition and subtraction. 
 * - Programmers often forget the other precedence rules, so you should use parentheses to make the order 
 * of evaluation explicit.
 */
public class Precedence_Demo_10 {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;

		/*
		 * These statements look roughly the same, but from the output you can
		 * see that they have very different meanings which depend on the use of
		 * parentheses.
		 */
		int a = x + y - 2 / 2 + z;
		int b = x + (y - 2) / (2 + z);

		System.out.println("a = " + a + " b = " + b);
	}
}
