package com_17.abstract_classes;

public class MyAbstractClass_DEMO_2 {
	public static void main(String[] args) {
		/*
		 * Demo-1
		 */
		MyConcreteClassForAbstract abstract1 = new MyConcreteClassForAbstract();

		abstract1.abstarctMethod();
		abstract1.nonAbstractMethod();
		abstract1.commonMethod();

		System.out.println();
		/*
		 * Demo-2
		 */
		MyAbstractClass abstractClass = new MyConcreteClassForAbstract();
		abstractClass.abstarctMethod();
		abstractClass.commonMethod();

	}
}
