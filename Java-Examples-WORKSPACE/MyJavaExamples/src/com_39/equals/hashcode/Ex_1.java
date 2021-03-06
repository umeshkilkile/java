package com_39.equals.hashcode;

import java.util.ArrayList;
import java.util.List;

public class Ex_1 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("123");

		/*
		 * The ArrayList iterates all its elements and execute
		 * "123".equals(element) to determine if the element is equal to the
		 * parameter object "123". It is the String.equals() implementation that
		 * determines if two strings are equal.
		 */
		boolean contains123 = list.contains("123");
		System.out.println(contains123);

		/*
		 * The ArrayList again iterates all its elements and execute
		 * "123".equals(element) to determine if the element is equal to the
		 * parameter object "123". The first element it finds that is equal to
		 * the given parameter "123" is removed.
		 */
		boolean removed = list.remove("123");
		System.out.println(removed);
	}
}

/*
 * - equals() is used in most collections to determine if a collection contains
 * a given element.
 */