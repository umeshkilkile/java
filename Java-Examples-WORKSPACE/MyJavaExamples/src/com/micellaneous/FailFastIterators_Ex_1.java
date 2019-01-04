package com.micellaneous;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastIterators_Ex_1 {
	public static void main(String args[]) {
		List<String> cities = Arrays.asList("Bangkok", "Zurich", "Detroit");

		Iterator<String> citiesIterator = cities.iterator();
		while (citiesIterator.hasNext()) {
			String s = citiesIterator.next();
			System.out.println(s);
			/*
			 * java.lang.UnsupportedOperationException gets thrown at the
			 * beginning of a next iteration cycle after the modification was
			 * performed.
			 */
			cities.add("Chennai");
		}
	}
}
/*
 * Fail-Fast Iterators
 * 
 * - Fail-Fast systems abort operation as-fast-as-possible exposing failures
 * immediately and stopping the whole operation.
 * 
 * - Fail-fast iterators in Java don’t play along when the underlying collection
 * gets modified.
 */