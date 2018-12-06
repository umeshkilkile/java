package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 1. It is highly advisable that you start your Array with a number of elements
 * that suits your current goal, without the need for dynamic creation of new
 * spaces, or if you know you’ll have to store 300-400 objects in an Array , set
 * 500. (java.util.ArrayList.ArrayList<String>(int initialCapacity))
 * 
 * 2. ArrayList is not synchronized, hence are not thread-safe.
 * 
 * @author kilkile Iterating over a ArrayList
 */

public class LIST_Iterate_ArrayList_1 {
	public static void main(String[] args) {
		List<String> listCountries = new ArrayList<String>(10);

		listCountries.add("India");
		listCountries.add("Finland");
		listCountries.add("Ireland");
		listCountries.add("America");
		listCountries.add("France");

		System.out.println(listCountries);

		/*
		 * Snippet 1: Iterate over a list using Iterator
		 */
		System.out.println("\nUsing Iterator(1)\n");
		Iterator<String> listIterator = listCountries.iterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		/*
		 * Snippet 2: Iterate over a list using Iterator (Using for loop)
		 */
		System.out.println("\nUsing Iterator(2)\n");
		for (Iterator<String> listIterator2 = listCountries.iterator(); listIterator2
				.hasNext();) {
			System.out.println(listIterator2.next());
		}

		/*
		 * Snippet 3: Iterate over a list using For each loop
		 */
		System.out.println("\nUsing for each loop\n");
		for (String str : listCountries) {
			System.out.println(str);
		}

		/*
		 * Snippet 4: Iterate over a list using For loop
		 */
		System.out.println("\nUsing Traditional for loop\n");
		for (int i = 0; i < listCountries.size(); i++) {
			System.out.println(listCountries.get(i));
		}

		/*
		 * Snippet 5: Iterate over a list using ListIterator
		 */
		System.out.println("\nUsing ListIterator in reverse order\n");
		for (ListIterator<String> listIterator3 = listCountries
				.listIterator(listCountries.size()); listIterator3
				.hasPrevious();) {
			System.out.println(listIterator3.previous());
		}

	}
}
