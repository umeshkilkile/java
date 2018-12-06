package com_16.polymorphism;

//Order of constructor calls, when using composition and inheritance
public class Sandwich_Demo extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	public Sandwich_Demo() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich_Demo();
	}
}
/*
 * The order of constructor calls for a complex object is as follows:
 * 
 * 1. The base-class constructor is called. This step is repeated recursively
 * such that the root of the hierarchy is constructed first, followed by the
 * next-derived class, etc., until the most-derived class is reached.
 * 
 * 2. Member initializers are called in the order of declaration.
 * 
 * 3. The body of the derived-class constructor is called.
 * 
 * - The order of the constructor calls is important. When you inherit, you know
 * all about the base class and can access any public and protected members of
 * the base class. This means that you must be able to assume that all the
 * members of the base class are valid when you’re in the derived class. In a
 * normal method, construction has already taken place, so all the members of
 * all parts of the object have been built. Inside the constructor, however, you
 * must be able to assume that all members that you use have been built. The
 * only way to guarantee this is for the base-class constructor to be called
 * first. Then when you’re in the derived-class constructor, all the members you
 * can access in the base class have been initialized. Knowing that all members
 * are valid inside the constructor is also the reason that, whenever possible,
 * you should initialize all member objects (that is, objects placed in the
 * class using composition) at their point of definition in the class (e.g., b,
 * c, and l in the preceding example).
 */