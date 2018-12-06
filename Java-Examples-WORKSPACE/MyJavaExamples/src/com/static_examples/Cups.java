package com.static_examples;

public class Cups {
	static Cup cup1;
	static Cup cup2;
	/*
	 * This code, like other static initializations, is executed only once: the
	 * first time you make an object of that class or the first time you access
	 * a static member of that class (even if you never make an object of that
	 * class).
	 */
	static {
		System.out.println("In static block");
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	Cups() {
		System.out.println("Cups()");
	}
}
