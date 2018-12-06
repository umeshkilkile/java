package com_15.inheritance;

public class Overide_Static_Methods_DEMO_3 extends Animal {
	public static void testClassMethod() {
		System.out.println("The static method in Overide_Static_Methods");
	}

	@Override
	public void testInstanceMethod() {
		System.out.println("The instance method in Overide_Static_Methods");
	}

	public static void main(String[] args) {
		Overide_Static_Methods_DEMO_3 myCat = new Overide_Static_Methods_DEMO_3();
		Animal myAnimal = myCat;
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();
		Overide_Static_Methods_DEMO_3.testClassMethod();
	}
}
