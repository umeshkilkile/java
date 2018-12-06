package com_35.exceptions;

public class StackTraceInformation_Demo_9 {
	public static void main(String[] args) {
		int a = 10;
		int array[] = new int[10];

		array[1] = 100;
		array[2] = 200;

		try {
			// int sum = a / 0; //java.lang.ArithmeticException
			int ele = array[11]; // java.lang.ArrayIndexOutOfBoundsException
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException anyException) {
			printStackTraceInfo(anyException);
		}
	}

	public static void printStackTraceInfo(Throwable cause) {
		StackTraceElement elements[] = cause.getStackTrace();
		for (int i = 0, n = elements.length; i < n; i++) {
			System.err.println("FileName : " + elements[i].getFileName() + "\nLine Number : " + elements[i].getLineNumber() + "\nMethodName : "
					+ elements[i].getMethodName() + "()");
		}
	}
}
