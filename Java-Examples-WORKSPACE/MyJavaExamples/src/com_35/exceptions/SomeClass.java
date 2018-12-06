package com_35.exceptions;

public class SomeClass {
	@SuppressWarnings("finally")
	public int returnWhat() {
		try {
			System.out.println("SomeClass.returnWhat()");
			return 100;
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			return 200;
		}

		// return 300; // Unreachable code
	}
}
