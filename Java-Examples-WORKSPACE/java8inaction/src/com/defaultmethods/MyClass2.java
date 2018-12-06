package com.defaultmethods;

public class MyClass2 implements MyInterface {

	@Override
	public int add(int a, int b) {
		System.out.println("MyClass2.add()");
		return a + b;
	}

	@Override
	public int sub(int max, int min) {
		System.out.println("MyClass2.sub()");
		return min - max;
	}
}
