package com.inheritance;

/*
 * - The Java inheritance mechanism does not include constructors. 
 * - In other words, constructors of a superclass are not inherited by subclasses. 
 * - Subclasses can still call the constructors in the superclass using the super() contruct. 
 * - In fact, a subclass constructor is required to call one of the constructors in the superclass as the very first action inside 
 * 	the constructor body.
 */
public class SubClass extends SuperClass {
	public SubClass() {
		super();
		System.out.println("SubClass.SubClass()");
	}
}
