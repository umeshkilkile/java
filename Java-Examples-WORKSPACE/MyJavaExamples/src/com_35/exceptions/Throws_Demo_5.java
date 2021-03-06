package com_35.exceptions;

public class Throws_Demo_5 {
	public static void main(String[] args) {
		SimpleClass class1 = new SimpleClass();

		try {
			System.out.println("Inside try - Throws_Demo_5");
			class1.oneMethod();
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
			// System.out.println("Inside catch - Throws_Demo_5");
			// exception.printStackTrace();

			StackTraceElement elements[] = exception.getStackTrace();
			for (int i = 0, n = elements.length; i < n; i++) {
				System.err.println(elements[i].getFileName() + ":"
						+ elements[i].getLineNumber() + ">> "
						+ elements[i].getMethodName() + "()");
			}
		}

	}
}
