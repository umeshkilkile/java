package com_16.polymorphism;

//Cleanup and inheritance.
public class Frog_Demo extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");

	public Frog_Demo() {
		System.out.println("Frog()");
	}

	protected void dispose() {
		System.out.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		Frog_Demo frog = new Frog_Demo();
		System.out.println("Bye!");
		frog.dispose();
	}
}
/*
 * Inheritance and cleanup
 * 
 * When using composition and inheritance to create a new class, most of the
 * time you won�t have to worry about cleaning up; subobjects can usually be
 * left to the garbage collector.If you do have cleanup issues, you must be
 * diligent and create a dispose( ) method for your new class. And with
 * inheritance, you must override dispose( ) in the derived class if you have
 * any special cleanup that must happen as part of garbage collection. When you
 * override dispose( ) in an inherited class, it�s important to remember to call
 * the base-class version of dispose( ), since otherwise the base-class cleanup
 * will not happen.
 * 
 * Each class in the hierarchy also contains a member objects of types
 * Characteristic and Description, which must also be disposed. The order of
 * disposal should be the reverse of the order of initialization, in case one
 * subobject is dependent on another. For fields, this means the reverse of the
 * order of declaration (since fields are initialized in declaration order). For
 * base classes (following the form that�s used in C++ for destructors), you
 * should perform the derived-class cleanup first, then the base-class cleanup.
 * That�s because the derived-class cleanup could call some methods in the base
 * class that require the base-class components to be alive, so you must not
 * destroy them prematurely. From the output you can see that all parts of the
 * Frog object are disposed in reverse order of creation.
 */