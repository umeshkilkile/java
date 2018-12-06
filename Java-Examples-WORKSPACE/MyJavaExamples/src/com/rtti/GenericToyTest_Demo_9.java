package com.rtti;

/*
 * An interesting thing happens when you use the generic syntax for Class
 * objects: newlnstance( ) will return the exact type of the object, rather than
 * just a basic Object as you saw in ToyTest.java. This is somewhat limited:
 */
public class GenericToyTest_Demo_9 {
	public static void main(String[] args) throws Exception {
		Class<FancyToy> ftClass = FancyToy.class;
		System.out.println(ftClass);

		// Produces exact type:
		FancyToy fancyToy = ftClass.newInstance();
		System.out.println(fancyToy.getClass().getName());

		Class<? super FancyToy> up = ftClass.getSuperclass();
		System.out.println(up.getName());
		// This won’t compile:
		// Class<Toy> up2 = ftClass.getSuperclass();
		// Only produces Object:
		Object obj = up.newInstance();
		System.out.println(obj.getClass().getName());
	}
}
/*
 * If you get the superclass, the compiler will only allow you to say that the
 * superclass reference is "some class that is a superclass of FancyToy" as seen
 * in the expression Class <? super FancyToy >. It will not accept a declaration
 * of Class<Toy>. This seems a bit strange because getSuperclass( ) returns the
 * base class (not interface) and the compiler knows what that class is at
 * compile time—in this case, Toy.class, not just "some superclass of FancyToy."
 * In any event, because of the vagueness, the return value of up.newlnstance( )
 * is not a precise type, but just an Object.
 */
