package com.strings;

/*
 * - If you use the same string (e.g. "Hello World") in other String variable declarations, 
 * the Java virtual machine may only create a single String instance in memory. 
 * 
 * - The string literal thus becomes a de facto constant or singleton. 
 * 
 * - The various different variables initialized to the same constant string will point to the same String instance in memory. 
 */
public class String_Demo_1 {
	public static void main(String[] args) {

		/*
		 * In this case the Java virtual machine will make both myString1 and
		 * myString2 point to the same String object.
		 */
		String myString1 = "Hello World";
		String myString2 = "Hello World";

		System.out.println(myString1 + " : " + myString1.hashCode());
		System.out.println(myString2 + " : " + myString2.hashCode());

		/*
		 * - If you want to be sure that two String variables point to separate
		 * String objects, use the new operator like this:
		 * 
		 * - Even though the value (text) of the two Java Strings created is the
		 * same, the Java virtual machine will create two different objects in
		 * memory to represent them.
		 */
		String myString3 = new String("Hello World");
		String myString4 = new String("Hello World");

		System.out.println(myString3 + " : " + myString3.hashCode());
		System.out.println(myString4 + " : " + myString4.hashCode());

	}
}
