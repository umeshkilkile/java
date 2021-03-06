package com_31.collections.SORTED_SET_INTERFACE;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_Ex_3 {
	public static void main(String[] args) {

		NavigableSet original = new TreeSet();
		original.add("1");
		original.add("2");
		original.add("3");

		/*
		 * The ceiling() method returns the least (smallest) element in this set
		 * that is greater than or equal to the element passed as parameter to
		 * the ceiling() method.
		 */
		// ceiling will be "2".
		Object ceiling = original.ceiling("2");
		System.out.println(ceiling);

		/*
		 * The floor() method does the opposite of ceiling()
		 */
		// floor will be "2".
		Object floor = original.floor("2");
		System.out.println(floor);

		/*
		 * The higher() method returns the least (smallest) element in this set
		 * that is greater than (not equal too) the element passed as parameter
		 * to the higher() method.
		 */
		// higher will be "3".
		Object higher = original.higher("2");
		System.out.println(higher);

		/*
		 * The lower() method does the opposite of the higher() method.
		 */
		// lower will be "1"
		Object lower = original.lower("2");
		System.out.println(lower);
	}
}
