package com_35.exceptions;

public class NeverCaught_Demo {
	static void f() {
		throw new RuntimeException("From f()");
	}

	static void g() {
		f();
	}

	public static void main(String[] args) {
		g();
	}
}
/*
 * - What happens when you don�t catch such exceptions? Since the compiler
 * doesn�t enforce exception specifications for these, it�s quite plausible that
 * a RuntimeException could percolate all the way out to your main( ) method
 * without being caught.
 * 
 * - If a RuntimeException gets all the way out to main( ) without being caught,
 * printStackTrace( ) is called for that exception as the program exits.
 */