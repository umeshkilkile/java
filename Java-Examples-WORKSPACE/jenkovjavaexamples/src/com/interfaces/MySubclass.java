package com.interfaces;

public class MySubclass extends MySuperClass implements MyInterface {
	@Override
	public void sayHello() {
		System.out.println("MySubclass.sayHello()");
	}
}
