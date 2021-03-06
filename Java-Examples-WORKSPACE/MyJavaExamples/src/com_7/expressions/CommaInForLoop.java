package com_7.expressions;

public class CommaInForLoop {
	public static void main(String[] args) {
		/*
		 * Using the comma operator, you can define multiple variables within a
		 * for statement, but they must be of the same type.You cannot use this
		 * approach with any of the other selection or iteration statements.
		 */
		for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
			System.out.println("i = " + i + " j = " + j);
		}
	}
}
