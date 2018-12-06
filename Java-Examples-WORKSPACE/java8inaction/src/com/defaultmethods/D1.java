package com.defaultmethods;

public class D1 implements A {

	@Override
	public String greet() {
		return "Hello from D1";
	}

	@Override
	public void hello() {
		System.out.println("Hello from D");
	}
}
