package com.defaultmethods;

public interface A {
	default public void hello() {
		System.out.println("Hello form A");
	}

	public String greet();
}