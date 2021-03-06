package com.CountOccurrencesofaCharinaString_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example_1 {
	public static void main(String[] args) {
		// Imperative Approach
		String someString = "elephant";
		char someChar = 'e';
		int count = 0;

		for (int i = 0; i < someString.length(); i++) {
			if (someString.charAt(i) == someChar) {
				count++;
			}
		}
		System.out.println("count = " + count);

		// Using Recursion
		int count2 = countOccurences(someString, 'n', 0);
		System.out.println("count2 = " + count2);

		// Using Regular Expressions
		Pattern pattern = Pattern.compile("[^e]*e");
		Matcher matcher = pattern.matcher(someString);
		int count3 = 0;
		while (matcher.find()) {
			count3++;
		}
		System.out.println("count3 = " + count3);

		// Using Java 8 Features
		long count4 = someString.chars().filter(ch -> ch == 'e').count();
		System.out.println("count4 = " + count4);

		long count5 = someString.codePoints().filter(ch -> ch == 'e').count();
		System.out.println("count5 = " + count5);
	}

	// Using Recursion
	public static int countOccurences(String someString, char searchedChar, int index) {
		if (index >= someString.length()) {
			return 0;
		}
		int count = someString.charAt(index) == searchedChar ? 1 : 0;
		return count + countOccurences(someString, searchedChar, index + 1);
	}
}
