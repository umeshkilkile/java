package com.defaultmethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example_1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 5, 1, 2, 6);
		/*
		 * sort is a default method in the List interface
		 * 
		 * Comparator .naturalOrder method. It’s a new static method in the
		 * Comparator interface that returns a Comparator object to sort the
		 * elements in natural order (the standard alphanumerical sort).
		 */
		numbers.sort(Comparator.naturalOrder());
		System.out.println("numbers = " + numbers);
	}
}
