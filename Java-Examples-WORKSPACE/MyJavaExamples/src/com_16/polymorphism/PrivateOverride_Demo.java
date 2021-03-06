package com_16.polymorphism;

public class PrivateOverride_Demo {
	private void f() {
		System.out.println("private f()");
	}

	public static void main(String[] args) {
		PrivateOverride_Demo po = new Derived();
		po.f();
	}
}
/*
 * - You might reasonably expect the output to be �public f( )�, but a private
 * method is automatically final, and is also hidden from the derived class. So
 * Derived�s f( ) in this case is a brand new method; it�s not even overloaded,
 * since the base-class version of f( ) isn�t visible in Derived.
 * 
 * - The result of this is that only non-private methods may be overridden, but
 * you should watch out for the appearance of overriding private methods, which
 * generates no compiler warnings, but doesn�t do what you might expect. To be
 * clear, you should use a different name from a private base-class method in
 * your derived class.
 */