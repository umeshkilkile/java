package com_15.inheritance;

public class SuperSubClass_DEMO_4 {
	public static void main(String[] args) {

		/*
		 * Super Class reference variable holding subclass object
		 */
		Subclass subclass = new Subclass();
		SuperClass superClass = subclass;

		/*
		 * The reverse is not allowed
		 */
		/*SuperClass superClass2 = new SuperClass();
		Subclass subclass2 = superClass2;*/

	}
}