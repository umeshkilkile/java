package com_17.abstract_classes;

public class MyConcreteClass_DEMO_1 {
	public static void main(String[] args) {
		/*
		 * Demo-1
		 */
		MyConcreteClass class1 = new MyConcreteClass();
		System.out.println(class1.methodOne());
		System.out.println(class1.anotherMethod());

		System.out.println();
		/*
		 * Demo-2
		 */
		MyInterface interface1 = new MyConcreteClass();
		System.out.println(interface1.methodOne());
		// System.out.println(interface1.anotherMethod()); Can't access via interface reference variable

	}
}
