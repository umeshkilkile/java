package com_21.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards_Demo_11 {
	public static void main(String[] args) {

		/*
		 * Without Unbounded wildcards
		 */
		/*List<Integer> li1 = Arrays.asList(1, 2, 3);
		List<String> ls1 = Arrays.asList("one", "two", "three");
		printListBefore(li1);
		printListBefore(ls1);*/
		
		
		/*
		 * With Unbounded wildcards
		 */
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String> ls = Arrays.asList("one", "two", "three");
		printListUnbounded(li);
		printListUnbounded(ls);
	}

	/*
	 * Without Unbounded wildcards
	 */
	public static void printListBefore(List<Object> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

	/*
	 * With Unbounded wildcards
	 */
	public static void printListUnbounded(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}
}
