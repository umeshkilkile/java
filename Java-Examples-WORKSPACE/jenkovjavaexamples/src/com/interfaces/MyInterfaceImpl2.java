package com.interfaces;

public class MyInterfaceImpl2 implements MyInterface, MyOtherInterface {

	@Override
	public void sayGoodbye() {
		System.out.println("Goodbye");
	}

	@Override
	public void sayHello() {
		System.out.println("Hello");
	}
}
