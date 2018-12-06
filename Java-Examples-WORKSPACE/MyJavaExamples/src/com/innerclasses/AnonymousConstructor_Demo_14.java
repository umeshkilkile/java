package com.innerclasses;

//Creating a constructor for an anonymous inner class.
public class AnonymousConstructor_Demo_14 {
	public static Base getBase(int i) {
		return new Base(i) {
			{
				System.out.println("Inside instance initializer");
			}

			public void f() {
				System.out.println("In anonymous f()");
			}
		};
	}

	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}
/*
 * In this case, the variable i did nor have to be final. While i is passed to
 * the base constructor of the anonymous class, it is never directly used inside
 * the anonymous class.
 */