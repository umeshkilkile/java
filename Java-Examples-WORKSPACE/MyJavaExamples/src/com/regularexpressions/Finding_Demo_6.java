package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//: strings/Finding.java
public class Finding_Demo_6 {
	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet’s wings");
		while (m.find())
			System.out.println(m.group() + " ");
		System.out.println();
		int i = 0;
		while (m.find(i)) {
			System.out.println(m.group() + " ");
			i++;
		}
	}
}
/*
 * The pattern ‘\\w+’ splits the input into words. find( ) is like an iterator,
 * moving forward through the input string. However, the second version of find(
 * ) can be given an integer argument that tells it the character position for
 * the beginning of the search—this version resets the search position to the
 * value of the argument, as you can see from the output.
 */