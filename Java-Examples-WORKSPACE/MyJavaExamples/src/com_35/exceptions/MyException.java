package com_35.exceptions;

class MyException extends Exception {
	public MyException() {
	}

	public MyException(String msg) {
		super(msg);
	}
}
/*
 * Two constructors that define the way MyException is created. In the second
 * constructor, the base-class constructor with a String argument is explicitly
 * invoked by using the super keyword.
 */