package com.inheritance;

/*
 * - The same Java inheritance rules apply to nested classes. 
 * - Nested classes which are declared private are not inherited. 
 * - Nested classes with the default (package) access modifier are only accessible to subclasses if the subclass is located 
 * 		in the same package as the superclass. 
 * - Nested classes with the protected or public access modifier are always inherited by subclasses.
 */
public class MySubclass extends MyClass {

	public static void main(String[] args) {
		MySubclass subclass = new MySubclass();
		MyNestedClass nested = subclass.new MyNestedClass();
	}
}