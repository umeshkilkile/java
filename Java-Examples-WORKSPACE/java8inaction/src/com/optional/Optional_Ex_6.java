package com.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Optional_Ex_6 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("AA", "aa");
		map.put("key", "value");

		// Wrapping a potentially null value in an optional

		// Old way
		Object value = map.get("key");
		System.out.println("value = " + value);

		// Using Optional
		/*
		 * You can use this method every time you want to safely transform a
		 * value that could be potentially null into an optional.
		 */
		Optional<Object> value2 = Optional.ofNullable(map.get("key"));
		System.out.println("value2 = " + value2);

		Optional<Object> value3 = Optional.ofNullable(map.get("key1"));
		System.out.println("value3 = " + value3);

		// String to int
		Optional<Integer> i1 = stringToInt("1234");
		System.out.println(i1);

		Optional<Integer> i2 = stringToInt("1234UI");
		System.out.println(i2);
	}

	// Converting a String into an Integer returning an optional
	public static Optional<Integer> stringToInt(String s) {
		try {
			// If the String can be converted into an Integer, return an
			// optional containing it
			return Optional.of(Integer.parseInt(s));
		} catch (NumberFormatException nfe) {
			// Otherwise return an empty optional
			return Optional.empty();
		}
	}

}
