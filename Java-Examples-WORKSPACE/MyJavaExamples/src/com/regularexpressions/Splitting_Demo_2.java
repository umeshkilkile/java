package com.regularexpressions;

import java.util.Arrays;

public class Splitting_Demo_2 {
	public static String knights = "Then, when you have found the shrubbery, you must "
			+ "cut down the mightiest tree in the forest... " + "with... a herring!";

	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}

	public static void main(String[] args) {
		split(" "); // Doesn�t have to contain regex chars
		split("\\W+"); // Non-word characters
		split("n\\W+"); // �n� followed by non-word characters
	}
}
/*
 * - First, note that you may use ordinary characters as regular expressions�a
 * regular expression doesn�t have to contain special characters, as you can see
 * in the first call to split( ), which just splits on whitespace.
 * 
 * - The second and third calls to split( ) use �\W�, which means a non-word
 * character (the lowercase version, �\w�, means a word character)�you can see
 * that the punctuation has been removed in the second case. The third call to
 * split( ) says, "the letter n followed by one or more non-word characters."
 * You can see that the split patterns do not appear in the result.
 */
