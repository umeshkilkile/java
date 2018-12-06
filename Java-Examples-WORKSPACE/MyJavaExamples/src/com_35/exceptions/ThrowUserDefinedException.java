package com_35.exceptions;

public class ThrowUserDefinedException {
	public void someMethod() throws UserDefinedException {
		throw new UserDefinedException("This is user defined exception!");
	}
}
