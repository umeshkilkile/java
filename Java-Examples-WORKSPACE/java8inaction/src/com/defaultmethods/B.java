package com.defaultmethods;

public interface B extends A {
	default void hello() {
		System.out.println("Hello form B");
	}

	public String greet();
}