package com.nestedclasses;

class MNA {
	private void f() {
		System.out.println("MNA.f()");
	}

	class A {
		private void g() {
			System.out.println("MNA.A.g()");
		}

		public class B {
			void h() {
				System.out.println("MNA.A.B.h()");
				g();
				f();
			}
		}
	}
}
/*
 * You can see that in MNAAB, the methods g( ) and f( ) are callable without any
 * qualification (despite the fact that they are private). This example also
 * demonstrates the syntax necessary to create objects of multiply nested inner
 * classes when you create the objects in a different class. The ".new" syntax
 * produces the correct scope, so you do not have to qualify the class name in
 * the constructor call.
 */