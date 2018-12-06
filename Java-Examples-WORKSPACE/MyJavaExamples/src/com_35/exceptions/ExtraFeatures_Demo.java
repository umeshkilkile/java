package com_35.exceptions;

public class ExtraFeatures_Demo {
	public static void f() throws MyException2 {
		System.out.println("Throwing MyException2 from f()");
		throw new MyException2();
	}

	public static void g() throws MyException2 {
		System.out.println("Throwing MyException2 from g()");
		throw new MyException2("Originated in g()");
	}

	public static void h() throws MyException2 {
		System.out.println("Throwing MyException2 from h()");
		throw new MyException2("Originated in h()", 47);
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (MyException2 e) {
			e.printStackTrace(System.out);
			System.out.println("e.val() = " + e.val());
		}
	}
}
/*
 * A field x has been added, along with a method that reads that value and an
 * additional constructor that sets it. In addition, Throwable.getMessage( ) has
 * been overridden to produce a more interesting detail message. getMessage( )
 * is something like toString( ) for exception classes.
 */