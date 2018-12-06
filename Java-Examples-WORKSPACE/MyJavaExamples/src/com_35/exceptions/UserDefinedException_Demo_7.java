package com_35.exceptions;

public class UserDefinedException_Demo_7 {
	public static void main(String[] args) {
		try {
			new ThrowUserDefinedException().someMethod();
		} catch (UserDefinedException definedException) {
			definedException.getMessage();
		}
	}
}
