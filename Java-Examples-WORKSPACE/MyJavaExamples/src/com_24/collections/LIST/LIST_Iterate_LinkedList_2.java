package com_24.collections.LIST;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author kilkile Iterating over a LinkedList
 */

public class LIST_Iterate_LinkedList_2 {
	public static void main(String[] args) {
		List<String> listCountries = new LinkedList<String>();

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
		 * Snippet 4: Iterate over a list using For each loop
		 */
		System.out.println("\nUsing Traditional for loop\n");
		for (int i = 0; i < listCountries.size(); i++) {
			System.out.println(listCountries.get(i));
		}

	}
}
