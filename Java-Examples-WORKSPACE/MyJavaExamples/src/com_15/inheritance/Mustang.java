package com_15.inheritance;

/*
 * Inherited instance methods from classes can override abstract interface methods
 */
public class Mustang extends Horse implements Mammal {
	public static void main(String... args) {
		Mustang myApp = new Mustang();
		System.out.println(myApp.identifyMyself());
	}
}
