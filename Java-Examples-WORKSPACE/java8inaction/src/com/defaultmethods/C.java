package com.defaultmethods;

public class C implements B, A {

	@Override
	public String greet() {
		return "Hello there from class C!";
	}

}
