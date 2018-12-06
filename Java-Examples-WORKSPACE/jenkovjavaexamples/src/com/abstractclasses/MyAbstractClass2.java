package com.abstractclasses;

/*
 * - An abstract class can have abstract methods. 
 * - You declare a method abstract by adding the abstract keyword in front of the method declaration.
 * - An abstract method has no implementation. It just has a method signature. Just like methods in a Java interface.
 * - If a class has an abstract method, the whole class must be declared abstract. 
 * - Not all methods in an abstract class have to be abstract methods. An abstract class can have a mixture of abstract and non-abstract methods.
 * - Subclasses of an abstract class must implement (override) all abstract methods of its abstract superclass. 
 * 		The non-abstract methods of the superclass are just inherited as they are. They can also be overridden, if needed.
 * 
 */
public abstract class MyAbstractClass2 {
	public abstract void abstractMethod();
}
