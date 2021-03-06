package com.JavaDoubleBraceInitialization_17;

import java.util.HashSet;
import java.util.Set;

public class InitializationApproach_1 {
	public static void main(String[] args) {

		// Standard approach
		Set<String> countries = new HashSet<String>();
		countries.add("India");
		countries.add("USSR");
		countries.add("USA");
		System.out.println(countries);

		/*
		 * As can be seen from below example, we are:
		 * 
		 * 1. Creating an anonymous inner class which extends HashSet
		 * 
		 * 2. Providing an instance initialization block which invokes the add
		 * method and adds the country name to the HashSet
		 * 
		 */
		// Double brace approach
		Set<String> countries2 = new HashSet<String>() {
			{
				add("India");
				add("USSR");
				add("USA");
			}
		};
		System.out.println(countries2);

	}
}
/*
 * Disadvantages of using double braces are:
 * 
 * 1. Obscure, not widely known way to do the initialization
 * 
 * 2. It creates an extra class every time we use it
 * 
 * 3. Doesn�t support the use of the �diamond operator� � a feature introduced
 * in Java 7
 * 
 * 4. Doesn�t work if the class we are trying to extend is marked final
 * 
 * 5. Holds a hidden reference to the enclosing instance, which may cause memory
 * leaks It�s due to these disadvantages that double brace initialization is
 * considered as an anti-pattern.
 */
