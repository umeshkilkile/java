package com.rtti;

import java.util.Random;

public class ClassInitialization_Demo_4 {
	public static Random rand = new Random(47);

	public static void main(String[] args) throws Exception {
		Class initable = Initable.class;
		System.out.println("After creating Initable ref");
		// Does not trigger initialization:
		System.out.println(Initable.staticFinal);
		// Does trigger initialization:
		System.out.println(Initable.staticFinal2);
		// Does trigger initialization:
		System.out.println(Initable2.staticNonFinal);
		Class initable3 = Class.forName("com.rtti.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNonFinal);
	}
}
/*
 * - Initialization is delayed until the first reference to a static method (the
 * constructor is implicitly static) or to a non-constant static field:
 * 
 * - Effectively, initialization is "as lazy as possible." From the creation of
 * the initable reference, you can see that just using the .class syntax to get
 * a reference to the class doesn’t cause initialization. However,
 * Class.forName( ) initializes the class immediately in order to produce the
 * Class reference, as you can see in the creation of initable3.
 * 
 * - If a static final value is a "compile-time constant," such as
 * Initable.staticFinal, that value can be read without causing the Initable
 * class to be initialized. Making a field static and final, however, does not
 * guarantee this behavior: accessing Initable.staticFinal2 forces class
 * initialization because it cannot be a compile-time constant.
 * 
 * - If a static field is not final, accessing it always requires linking (to
 * allocate storage for the field) and initialization (to initialize that
 * storage) before it can be read, as you can see in the access to
 * Initable2.staticNonFinal.
 */