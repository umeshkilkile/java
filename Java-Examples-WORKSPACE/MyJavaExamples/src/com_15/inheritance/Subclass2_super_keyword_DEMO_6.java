package com_15.inheritance;

public class Subclass2_super_keyword_DEMO_6 extends Superclass2 {
	// overrides printMethod in Superclass
	public void printMethod() {
		super.printMethod();
		System.out.println("Printed in Subclass");
	}

	public static void main(String[] args) {
		Subclass2_super_keyword_DEMO_6 s = new Subclass2_super_keyword_DEMO_6();
		s.printMethod();
	}
}
