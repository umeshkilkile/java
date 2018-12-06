package com.annotations;

public class Demo_4 {
	public static void main(String[] args) {

	}

	@MyAnnotation3(value = "test")
	public void m1() {
		System.out.println("me");
	}

	/*
	 * The annotation @MyAnnotation3 is disallowed for this location
	 */
	// @MyAnnotation3
	int value;
}
