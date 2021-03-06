package com_35.exceptions;

// Creating your own exceptions.
public class InheritingExceptions_Demo {
	public void f() throws SimpleException {
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		InheritingExceptions_Demo sed = new InheritingExceptions_Demo();
		try {
			sed.f();
		} catch (SimpleException e) {
			System.out.println("Caught it!");
		}
	}
}
