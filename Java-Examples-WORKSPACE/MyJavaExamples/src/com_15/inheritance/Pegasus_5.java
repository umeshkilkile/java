package com_15.inheritance;

/*
 * Instance methods are preferred over interface default methods.
 */
/**
 * Note: Static methods in interfaces are never inherited.
 *
 */
public class Pegasus_5 extends Horse implements Flyer, Mythical {
	public static void main(String... args) {
		Pegasus_5 myApp = new Pegasus_5();
		System.out.println(myApp.identifyMyself());
	}
}
