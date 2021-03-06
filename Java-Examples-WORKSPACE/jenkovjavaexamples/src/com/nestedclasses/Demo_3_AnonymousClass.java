package com.nestedclasses;

/*
 * Anonymous Classes
	- Anonymous classes in Java are nested classes without a class name. 
	- They are typically declared as either subclasses of an existing class, or as implementations of some interface.
	- Anonymous classes are defined when they are instantiated. 
 */
public class Demo_3_AnonymousClass {
	public static void main(String[] args) {
		SuperClass instance = new SuperClass() {

			public void doIt() {
				System.out.println("Anonymous class doIt()");
			}
		};

		instance.doIt();
	}
}
