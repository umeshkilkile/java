package com.annotations;

public class MySubClass extends MySuperClass {

	@Override
	public void doTheThing() {
		System.out.println("Do it differently");
	}
}

/*
 * - The @Override Java annotation is used above methods that override methods
 * in a superclass. If the method does not match a method in the superclass, the
 * compiler will give you an error.
 * 
 * - The @Override annotation is not necessary in order to override a method in
 * a superclass. It is a good idea to use it still, though. In case someone
 * changed the name of the overridden method in the superclass, your subclass
 * method would no longer override it. Without the @Override annotation you
 * would not find out. With the @Override annotation the compiler would tell you
 * that the method in the subclass is not overriding any method in the
 * superclass.
 * 
 */