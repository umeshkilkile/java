package com_6.operators;

public class InstanceofOperatorDemo_DEMO_7 {
	public static void main(String[] args) {

		Parent objParent = new Parent();
		Parent obj2Parent = new Child();

		System.out.println("objParent instanceof Parent: " + (objParent instanceof Parent));
		System.out.println("objParent instanceof Child: " + (objParent instanceof Child));
		System.out.println("objParent instanceof MyInterface: " + (objParent instanceof MyInterface));
		System.out.println("obj2Parent instanceof Parent: " + (obj2Parent instanceof Parent));
		System.out.println("obj2Parent instanceof Child: " + (obj2Parent instanceof Child));
		System.out.println("obj2Parent instanceof MyInterface: " + (obj2Parent instanceof MyInterface));
	}
}

class Parent {
}

class Child extends Parent implements MyInterface {
}

interface MyInterface {
}

/*
NOTEs - 1. When using the instanceof operator, keep in mind that null is not an instance of anything.

*/