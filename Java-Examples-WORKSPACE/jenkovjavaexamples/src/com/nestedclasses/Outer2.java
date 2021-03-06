package com.nestedclasses;

/*
 * Non-static nested classes (inner classes) have access to the fields of the enclosing class, even if they are declared private. 
 * Here is an example of that:
 */
public class Outer2 {
	private String text = "I am private!";

	public class Inner {
		public void printText() {
			System.out.println(text);
		}
	}
}
