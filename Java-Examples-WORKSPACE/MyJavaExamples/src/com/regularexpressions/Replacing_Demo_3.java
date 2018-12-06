package com.regularexpressions;

public class Replacing_Demo_3 {
	static String s = Splitting_Demo_2.knights;

	public static void main(String[] args) {
		System.out.println(s.replaceFirst("f\\w+", "located"));
		System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
}
/*
 * - The first expression matches the letter f followed by one or more word
 * characters (note that the w is lowercase this time). It only replaces the
 * first match that it finds, so the word "found" is replaced by the word
 * "located."
 * 
 * - The second expression matches any of the three words separated by the OR
 * vertical bars, and it replaces all matches that it finds.
 */