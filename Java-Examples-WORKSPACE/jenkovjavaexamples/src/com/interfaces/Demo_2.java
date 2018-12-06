package com.interfaces;

public class Demo_2 {
	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();

		myInterface.sayHello();
	}
}

/*
 * - Notice how the variable is declared to be of the interface type MyInterface
 * while the object created is of type MyInterfaceImpl. Java allows this because
 * the class MyInterfaceImpl implements the MyInterface interface. You can then
 * reference instances of the MyInterfaceImpl class as instances of the
 * MyInterface interface.
 * 
 * - You cannot create instances of a Java interface by itself. You must always
 * create an instance of some class that implements the interface, and reference
 * that instance as an instance of the interface.
 */