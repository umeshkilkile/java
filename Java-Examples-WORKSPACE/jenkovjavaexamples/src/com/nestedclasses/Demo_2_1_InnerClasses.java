package com.nestedclasses;

/*
 * Notice how the printText() method of the Inner class references the private text field of the Outer class. 
 * This is perfectly possible. Here is how you would call the printText() method:
 */
public class Demo_2_1_InnerClasses {
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		Outer2.Inner inner = outer.new Inner();
		inner.printText();
	}
}
