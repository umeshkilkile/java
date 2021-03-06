package com.innerclasses;

//Creating an inner class directly using the .new syntax.
public class DotNew_Demo_5 {
	public class Inner {
	}

	public static void main(String[] args) {
		DotNew_Demo_5 dn = new DotNew_Demo_5();
		DotNew_Demo_5.Inner dni = dn.new Inner();
	}
}
/*
 * Sometimes you want to tell some other object to create an object of one of
 * its inner classes. To do this you must provide a reference to the other
 * outer-class object in the new expression, using the .new syntax
 */