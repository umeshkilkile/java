package com_35.exceptions;

public class RethrowNew_Demo {
	public static void f() throws OneException {
		System.out.println("originating the exception in f()");
		throw new OneException("thrown from f()");
	}

	public static void main(String[] args) {
		try {
			try {
				f();
			} catch (OneException e) {
				System.out.println("Caught in inner try, e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		} catch (TwoException e) {
			System.out.println("Caught in outer try, e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}
/*
 * You never have to worry about cleaning up the previous exception, or any
 * exceptions for that matter. They’re all heap-based objects created with new,
 * so the garbage collector automatically cleans them all up.
 */