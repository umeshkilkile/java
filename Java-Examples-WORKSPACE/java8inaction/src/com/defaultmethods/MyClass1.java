package com.defaultmethods;

public class MyClass1 implements MyInterface {

	@Override
	public int add(int a, int b) {
		System.out.println("MyClass1.add()");
		return a + b;
	}

}
