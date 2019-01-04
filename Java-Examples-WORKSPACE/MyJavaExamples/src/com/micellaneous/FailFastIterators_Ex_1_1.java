package com.micellaneous;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FailFastIterators_Ex_1_1 {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 30, 4, 50, 6 };
		List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
		System.out.println("Before----------" + numbers);

		/*
		 * If during iteration over a Collection, an item is removed using
		 * Iterator‘s remove() method, that’s entirely safe and doesn’t throw an
		 * exception.
		 */
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			if (i == 30) {
				iterator.remove(); // ok!
			} else {
				System.out.println(i);
			}
		}
		System.out.println("After----------" + numbers);
		/*
		 * However, if the Collection‘s add() method is used for adding an
		 * element, it throws an exception:
		 */
		iterator = numbers.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			if (i == 50) {
				// numbers.remove(2); // No exception
				numbers.add(2); // ConcurrentModificationException
			} else {
				System.out.println(i);
			}
		}
		System.out.println("After-Itr2---------" + numbers);
	}
}
/*
 * The Fail-Fast behavior isn’t guaranteed to happen in all scenarios as it’s
 * impossible to predict behavior in case of concurrent modifications. These
 * iterators throw ConcurrentModificationException on a best effort basis.
 */