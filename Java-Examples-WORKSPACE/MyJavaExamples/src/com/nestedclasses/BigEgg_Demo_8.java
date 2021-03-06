package com.nestedclasses;

public class BigEgg_Demo_8 extends Egg {
	public class Yolk {
		public Yolk() {
			System.out.println("BigEgg.Yolk()");
		}
	}

	public static void main(String[] args) {
		new BigEgg_Demo_8();
	}
}
/*
 * The default constructor is synthesized automatically by the compiler, and
 * this calls the base-class default constructor. You might think that since a
 * BigEgg is being created, the "overridden" version of Yolk would be used, but
 * this is not the case, as you can see from the output.
 */