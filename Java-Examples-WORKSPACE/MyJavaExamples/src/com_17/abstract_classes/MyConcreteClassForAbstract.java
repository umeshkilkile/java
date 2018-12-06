package com_17.abstract_classes;

public class MyConcreteClassForAbstract extends MyAbstractClass {

	@Override
	public void abstarctMethod() {
		System.out.println("This is from abstarctMethod() method");
	}

	public void nonAbstractMethod() {
		System.out.println("This is from nonAbstractMethod() method");
	}
}
