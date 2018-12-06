package com.nestedclasses;

public class Demo_1_StaticNestedClass {
	public static void main(String[] args) {

		/*
		 * In order to create an instance of the Nested class you must reference
		 * it by prefixing it with the Outer class name, like this:
		 */
		Outer.Nested instance = new Outer.Nested();
	}
}

/*
 * - In Java a static nested class is essentially a normal class that has just
 * been nested inside another class.
 * 
 * - Being static, a static nested class can only access instance variables of
 * the enclosing class via a reference to an instance of the enclosing class.
 */