package com_35.exceptions;

public class SimpleClass {
	/*
	 * Remember that ArrayIndexOutOfBoundsException is an unchecked exception;
	 * including it in the throws clause is not mandatory
	 */
	public void oneMethod() throws ArithmeticException,
			ArrayIndexOutOfBoundsException {
		int a = 10;

		int array[] = new int[10];

		array[1] = 100;
		array[2] = 200;

		int sum = a / 0;
		int ele = array[11];
	}
}
