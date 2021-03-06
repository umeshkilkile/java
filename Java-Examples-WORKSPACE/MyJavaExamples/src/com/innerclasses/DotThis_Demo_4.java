package com.innerclasses;

//Qualifying access to the outer-class object.
public class DotThis_Demo_4 {
	void f() {
		System.out.println("DotThis_Demo_4.f()");
	}

	public class Inner {
		public DotThis_Demo_4 outer() {
			return DotThis_Demo_4.this;
			// A plain "this" would be Inner�s "this"
		}
	}

	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis_Demo_4 dt = new DotThis_Demo_4();
		DotThis_Demo_4.Inner dti = dt.inner();
		dti.outer().f();
	}
}
/*
 * If you need to produce the reference to the outer-class object, you name the
 * outer class followed by a dot and this. The resulting reference is
 * automatically the correct type, which is known and checked at compile time,
 * so there is no runtime overhead. Here�s an example that shows how to use
 * .this:
 */