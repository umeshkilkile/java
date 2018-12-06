package com_39.equals.hashcode;

public class StringHashCode_Demo_1 {
	public static void main(String[] args) {
		String[] hellos = "Hello Hello".split(" ");
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
	}
}
/*
 * The hashCode( ) for String is clearly based on the contents of the String.
 */