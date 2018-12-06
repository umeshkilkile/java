package com.nestedclasses;

//Two ways that a class can implement multiple interfaces.
public class MultiInterfaces_Demo_4 {
	static void takesA(A a) {
		System.out.println("MultiInterfaces_Demo_4.takesA()");
	}

	static void takesB(B b) {
		System.out.println("MultiInterfaces_Demo_4.takesB()");
	}

	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}
}
