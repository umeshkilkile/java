package com.anonymousclasses;

public class AnonymousDemo_1 {
	public static void main(String[] args) {

		// Myclass is implementation class of Age interface
		MyClass obj = new MyClass();

		// calling getage() method implemented at Myclass
		obj.getAge();

		/*
		 * As done in Program, there is no need to write a separate class
		 * Myclass. Instead, directly copy the code of Myclass into this
		 * parameter, as shown here:
		 */
		Age obj2 = new Age() {
			@Override
			public void getAge() {
				System.out.println("Age is from Anonymous class = " + x);

			}
		};
		obj2.getAge();
	}
}
