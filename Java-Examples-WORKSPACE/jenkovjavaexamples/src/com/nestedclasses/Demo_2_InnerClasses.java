package com.nestedclasses;

public class Demo_2_InnerClasses {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
	}
}

/*
 * - Non-static nested classes in Java are also called inner classes.
 * 
 * - Inner classes are associated with an instance of the enclosing class. Thus,
 * you must first create an instance of the enclosing class to create an
 * instance of an inner class.
 */