package com_9.classesandobjects;

public class Outer_Inner_StaticNested_Class_DEMO_18 {
	static private int outerX = 100;

	/*
	 * Static Nested Class
	 */
	static class StaticNestedClass {
		int staticNestedX = 200;
	}

	/*
	 * Inner class
	 */
	class InnerClass {
		int innerX = 300;
	}

	public static void main(String[] args) {
		/*
		 * Static nested classes are accessed using the enclosing class name
		 */
		Outer_Inner_StaticNested_Class_DEMO_18.StaticNestedClass nestedObject = new Outer_Inner_StaticNested_Class_DEMO_18.StaticNestedClass();
		System.out.println("staticNestedX : " + nestedObject.staticNestedX);

		/*
		 * To instantiate an inner class, you must first instantiate the outer
		 * class. Then, create the inner object within the outer object with
		 * this syntax:
		 */
		Outer_Inner_StaticNested_Class_DEMO_18.InnerClass innerObject = new Outer_Inner_StaticNested_Class_DEMO_18().new InnerClass();
		System.out.println("innerX  : " + innerObject.innerX);
	}
}
