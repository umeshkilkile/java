package com_31.collections.SORTED_SET_INTERFACE;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_Ex_4 {
	public static void main(String[] args) {

		NavigableSet original = new TreeSet();
		original.add("1");
		original.add("2");
		original.add("3");

		// first is "1"
		Object first = original.pollFirst();
		System.out.println(first);

		// last is "3"
		Object last = original.pollLast();
		System.out.println(last);

		System.out.println(original);
	}
}
