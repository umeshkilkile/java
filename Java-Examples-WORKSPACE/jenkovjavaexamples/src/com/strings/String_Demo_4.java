package com.strings;

/*
 * The compareTo() method compares the String to another String and returns an int telling whether this String is smaller, 
 * equal to or larger than the other String. If the String is earlier in sorting order than the other String, compareTo() returns a negative number. 
 * If the String is equal in sorting order to the other String, compareTo() returns 0. 
 * If the String is after the other String in sorting order, the compareTo() metod returns a positive number.
 */
public class String_Demo_4 {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String z = "z";

		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(z));
		System.out.println(a.compareTo(z));

		System.out.println(b.compareTo(a));
		System.out.println(z.compareTo(b));
		System.out.println(z.compareTo(a));

		System.out.println(a.compareTo(a));
		System.out.println(b.compareTo(b));
		System.out.println(z.compareTo(z));
		System.out.println("----------------------");

		String one = "1";
		String two = "2";
		String three = "3";

		System.out.println(one.compareTo(two));
		System.out.println(two.compareTo(three));
		System.out.println(one.compareTo(three));

		System.out.println(two.compareTo(one));
		System.out.println(three.compareTo(two));
		System.out.println(three.compareTo(one));

		System.out.println(one.compareTo(one));
		System.out.println(two.compareTo(two));
		System.out.println(three.compareTo(three));
	}
}
