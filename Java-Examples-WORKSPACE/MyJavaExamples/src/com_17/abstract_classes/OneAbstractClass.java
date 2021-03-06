package com_17.abstract_classes;

/*
 * In the section on Interfaces, it was noted that a class that implements an interface must implement all of the interface's methods. 
 * It is possible, however, to define a class that does not implement all of the interface's methods, provided that the class is declared to be abstract.
 */
public abstract class OneAbstractClass implements OneOnterface {

	public abstract void abstractMethod();

	public void abstractMethod2() {
		System.out.println("This is from abstractMethod2");
	}
	
	static public void staticMethod(){
		System.out.println("This is a static method in abstarct class");
	}
}
