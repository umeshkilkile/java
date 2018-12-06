package com.nestedclasses;

public class LocalInnerClass_Demo_10 {
	private int count = 0;

	Counter getCounter(final String name) {
		// A local inner class:
		class LocalCounter implements Counter {
			public LocalCounter() {
				// Local inner class can have a constructor
				System.out.println("LocalCounter()");
			}

			public int next() {
				System.out.println(name); // Access local final
				return count++;
			}
		}
		return new LocalCounter();
	}

	// The same thing with an anonymous inner class:
	Counter getCounter2(final String name) {
		return new Counter() {
			// Anonymous inner class cannot have a named
			// constructor, only an instance initializer:
			{
				System.out.println("Counter()");
			}

			public int next() {
				System.out.println(name); // Access local final
				return count++;
			}
		};
	}

	public static void main(String[] args) {
		LocalInnerClass_Demo_10 lic = new LocalInnerClass_Demo_10();
		Counter c1 = lic.getCounter("Local inner "), c2 = lic.getCounter2("Anonymous inner ");
		for (int i = 0; i < 5; i++)
			System.out.println(c1.next());
		for (int i = 0; i < 5; i++)
			System.out.println(c2.next());
	}
}
/*
 * - As noted earlier, inner classes can also be created inside code blocks,
 * typically inside the body of a method. A local inner class cannot have an
 * access specifier because it isn’t part of the outer class, but it does have
 * access to the final variables in the current code block and all the members
 * of the enclosing class. Here’s an example comparing the creation of a local
 * inner class with an anonymous inner class:
 * 
 * - Counter returns the next value in a sequence. It is implemented as both a
 * local class and an anonymous inner class, both of which have the same
 * behaviors and capabilities. Since the name of the local inner class is not
 * accessible outside the method, the only justification for using a local inner
 * class instead of an anonymous inner class is if you need a named constructor
 * and/or an overloaded constructor, since an anonymous inner class can only use
 * instance initialization.
 */
