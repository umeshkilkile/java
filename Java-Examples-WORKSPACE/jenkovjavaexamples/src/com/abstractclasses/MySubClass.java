package com.abstractclasses;

public class MySubClass extends MyAbstractClass2 {

	@Override
	public void abstractMethod() {
		System.out.println("My method implementation");
	}
}

/*
 * - The only time a subclass of an abstract class is not forced to implement
 * all abstract methods of its superclass, is if the subclass is also an
 * abstract class.
 */