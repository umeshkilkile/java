package com_17.abstract_classes;

public class ConcreteClass_DEMO_3 extends OneAbstractClass {

	public static void main(String[] args) {
		OneOnterface oneOnterface = new OneAbstractClass() {

			@Override
			public void interfaceMethod() {
				System.out.println("interfaceMethod");

			}

			@Override
			public void abstractMethod() {
				System.out.println("abstractMethod");

			}
		};

		oneOnterface.interfaceMethod();
		System.out.println();
		OneAbstractClass abstractClass = new ConcreteClass_DEMO_3();
		abstractClass.abstractMethod();
		abstractClass.abstractMethod2();
		abstractClass.interfaceMethod();

		System.out.println();
		OneAbstractClass.staticMethod();
	}

	@Override
	public void interfaceMethod() {
		System.out.println("Hiiii - interfaceMethod()");

	}

	@Override
	public void abstractMethod() {
		System.out.println("Hello - abstractMethod()");

	}
}
