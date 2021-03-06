package com.rtti;

public class InterfaceViolation_Demo_14 {
	public static void main(String[] args) {
		A a = new B();
		a.f();
		// a.g(); // Compile error
		System.out.println(a.getClass().getName());
		if (a instanceof B) {
			B b = (B) a;
			b.g();
		}
	}
}
/*
 * Using RTTI, we discover that a has been implemented as a B. By casting to B,
 * we can call a method that�s not in A.
 */
