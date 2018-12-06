package com.nestedclasses;

public class BigEgg2_Demo_9 extends Egg2 {
	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			System.out.println("BigEgg2.Yolk()");
		}

		public void f() {
			System.out.println("BigEgg2.Yolk.f()");
		}
	}

	public BigEgg2_Demo_9() {
		insertYolk(new Yolk());
	}

	public static void main(String[] args) {
		Egg2 e2 = new BigEgg2_Demo_9();
		e2.g();
	}
}
/*
 * Now BigEgg2.Yolk explicitly extends Egg2.Yolk and overrides its methods. The
 * method insertYolk( ) allows BigEgg2 to upcast one of its own Yolk objects
 * into the y reference in Egg2, so when g( ) calls y.f( ), the overridden
 * version of f( ) is used. The second call to Egg2.Yolk( ) is the base-class
 * constructor call of the BigEgg2.Yolk constructor. You can see that the
 * overridden version of f( ) is used when g( ) is called.
 */
