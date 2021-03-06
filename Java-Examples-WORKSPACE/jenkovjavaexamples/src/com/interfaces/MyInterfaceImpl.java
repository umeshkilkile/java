package com.interfaces;

public class MyInterfaceImpl implements MyInterface {

	public void sayHello() {
		System.out.println(MyInterface.hello);
	}
}
/*
 * A class that implements an interface must implement all the methods declared
 * in the interface. The methods must have the exact same signature (name +
 * parameters) as declared in the interface. The class does not need to
 * implement (declare) the variables of an interface. Only the methods.
 */