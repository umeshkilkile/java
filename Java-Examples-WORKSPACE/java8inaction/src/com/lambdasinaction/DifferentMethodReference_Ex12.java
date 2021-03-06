package com.lambdasinaction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class DifferentMethodReference_Ex12 {
	public static void main(String[] args) {

		// Without using method reference
		List<String> str = Arrays.asList("a", "b", "A", "B");
		str.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		System.out.println(str);

		// Using method reference
		List<String> str2 = Arrays.asList("a", "b", "A", "B");
		str2.sort(String::compareToIgnoreCase);
		System.out.println(str2);

		// Without using method reference
		Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
		System.out.println(stringToInteger.apply("2"));

		// Using method reference
		Function<String, Integer> stringToInteger2 = Integer::parseInt;
		System.out.println(stringToInteger2.apply("2"));

		// Without using method reference
		BiPredicate<List<String>, String> contains = (list, element) -> list.contains(element);
		System.out.println(contains.test(str, "A"));

		// Using method reference
		BiPredicate<List<String>, String> contains2 = List::contains;
		System.out.println(contains2.test(str, "A"));
	}
}
