package com.removelastcharacterinstring_15;

import java.util.Optional;

public class RemoveChar_1 {
	public static void main(String[] args) {
		String s = "Ramesh";
		System.out.println(removeLastChar(s));

		System.out.println(removeLastCharOptional(s));
	}

	public static String removeLastChar(String s) {
		return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
	}

	// Refactor the code and use Java 8
	public static String removeLastCharOptional(String s) {
		return Optional.ofNullable(s).filter(str -> str.length() != 0).map(str -> str.substring(0, str.length() - 1))
				.orElse(s);
	}
}
