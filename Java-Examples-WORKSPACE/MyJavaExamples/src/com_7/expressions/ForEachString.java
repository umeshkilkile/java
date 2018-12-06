package com_7.expressions;

public class ForEachString {
	public static void main(String[] args) {
		/*
		 * Any method that returns an array is a candidate for use with foreach.
		 * For example, the String class has a method toCharArray( ) that
		 * returns an array of char, so you can easily iterate through the
		 * characters in a string:
		 */
		for (char c : "An African Swallow".toCharArray())
			System.out.print(c + " ");
	}
}
