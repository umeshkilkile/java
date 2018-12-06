package com.micellaneous;

public class Scoping_Demo {
	public static void main(String[] args) {
		/*
		 * - Scoping : This determines both the visibility and lifetime of the
		 * names defined within that scope. In Java, scope is determined by the
		 * placement of curly braces {}.
		 * 
		 * - A variable defined within a scope is available only to the end of
		 * that scope.
		 */
		{
			int x = 12;
			// Only x available
			System.out.println("x = " + x);
			{
				int q = 96;
				// Both x & q available
				System.out.println("x = " + x);
				System.out.println("q = " + q);
			}
			// Only x available
			// q is "out of scope"
			System.out.println("x = " + x);
		}

		/*
		 * Scope of objects
		 * 
		 * - Java objects do not have the same lifetimes as primitives. When you
		 * create a Java object using new, it hangs around past the end of the
		 * scope. The reference s vanishes at the end of the scope. However, the
		 * String object that s was pointing to is still occupying memory. In
		 * this bit of code, there is no way to access the object after the end
		 * of the scope, because the only reference to it is out of scope.
		 */
		{
			String s = new String("a string");
			System.out.println(s);
		} // End of scope
	}
}
