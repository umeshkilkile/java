package com.innerclasses;

//Returning a reference to an inner class.
public class InnerClass_Demo_2 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public Destination to(String s) {
		return new Destination(s);
	}

	public Contents contents() {
		return new Contents();
	}

	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		InnerClass_Demo_2 p = new InnerClass_Demo_2();
		p.ship("Tasmania");
		InnerClass_Demo_2 q = new InnerClass_Demo_2();

		// Defining references to inner classes:
		InnerClass_Demo_2.Contents c = q.contents();
		InnerClass_Demo_2.Destination d = q.to("Borneo");
	}
}

/*
 * - If you want to make an object of the inner class anywhere except from
 * within a non-static method of the outer class, you must specify the type of
 * that object as OuterClassName.InnerClassName, as seen in main( ).
 * 
 * - Inner classes are just a name-hiding and code organization scheme, which is
 * helpful but not totally compelling.
 */