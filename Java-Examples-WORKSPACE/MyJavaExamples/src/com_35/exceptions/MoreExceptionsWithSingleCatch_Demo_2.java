package com_35.exceptions;

/*
 * In Java SE 7 and later, a single catch block can handle more than one type of exception
 */
public class MoreExceptionsWithSingleCatch_Demo_2 {
	public static void main(String[] args) {
		int a = 10;
		int array[] = new int[10];

		array[1] = 100;
		array[2] = 200;

		try {
			//int sum = a / 0; //java.lang.ArithmeticException
			int ele = array[11]; //java.lang.ArrayIndexOutOfBoundsException
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		}
	}
}
/*
 * Note: If a catch block handles more than one exception type, then the catch
 * parameter is implicitly final. In this example, the catch parameter exception
 * is final and therefore you cannot assign any values to it within the catch
 * block.
 */
