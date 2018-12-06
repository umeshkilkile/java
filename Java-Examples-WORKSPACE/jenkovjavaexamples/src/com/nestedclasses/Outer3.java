package com.nestedclasses;

/*
 * Inner Class Shadowing
	- If a Java inner class declares fields or methods with the same names as field or methods in its enclosing class, 
		the inner fields or methods are said to shadow over the outer fields or methods.
	- When the Inner class refers to text it refers to its own field. When Outer refers to text it also refers to its own field. 
 */
public class Outer3 {
	private String text = "I am Outer private!";

	public class Inner {

		private String text = "I am Inner private";

		public void printText() {
			System.out.println(text);
			System.out.println(Outer3.this.text);
		}
	}
}
