package com.rtti;

public class WildcardClassReferences_Demo_6 {
	public static void main(String[] args) {
		Class<?> intClass = int.class;
		System.out.println(intClass.getName());
		intClass = double.class;
		System.out.println(intClass.getName());
	}
}
/*
 * - To loosen the constraints when using generic Class references, I employ the
 * wildcard, which is part of Java generics. The wildcard symbol is ‘?’, and it
 * indicates "anything." So we can add wildcards to the ordinary Class reference
 * in the above example and produce the same results:
 * 
 * - In Java SE5, Class<?> is preferred over plain Class, even though they are
 * equivalent and the plain Class, as you saw, doesn’t produce a compiler
 * warning. The benefit of Class<?> is that it indicates that you aren’t just
 * using a non-specific class reference by accident, or out of ignorance. You
 * chose the non-specific version.
 */