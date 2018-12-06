package com.nestedclasses;

/*
 * - A Java anonymous class can also implement an interface instead of extending a class.
 * 
 * - An anonymous class can access members of the enclosing class. It can also access local variables which are declared final or effectively final (since Java 8).
 */
public class Demo_3_1_AnonymousClass {
	public static void main(String[] args) {
		MyInterface instance = new MyInterface() {

			public void doIt() {
				System.out.println("Anonymous class doIt()");
			}
		};

		instance.doIt();
	}
}
