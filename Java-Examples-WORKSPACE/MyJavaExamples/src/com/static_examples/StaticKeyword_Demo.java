package com.static_examples;

public class StaticKeyword_Demo {
	public static void main(String[] args) {

		/*
		 * Now even if you make two StaticTest objects, there will still be only
		 * one piece of storage for StaticTest.i. Both objects will share the
		 * same i.
		 */
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();

		/*
		 * At this point, both st1.i and st2.i have the same value of 47 since
		 * they refer to the same piece of memory.
		 */
		System.out.println(st1.i);
		System.out.println(st2.i);

		/*
		 * There are two ways to refer to a static variable. As the preceding
		 * example indicates, you can name it via an object, by saying, for
		 * example, st2.i.
		 */
		System.out.println(st2.i);

		/*
		 * You can also refer to it directly through its class name, something
		 * you cannot do with a non-static member.
		 */
		System.out.println(StaticTest.i);

		/*
		 * The ++ operator adds one to the variable. At this point, both st1.i
		 * and st2.i will have the value 48.
		 */
		StaticTest.i++;

		System.out.println(st1.i);
		System.out.println(st2.i);

	}
}

/*
 * - Using the class name is the preferred way to refer to a static variable.
 * Not only does it emphasize that variable�s static nature, but in some cases
 * it gives the compiler better opportunities for optimization.
 */
