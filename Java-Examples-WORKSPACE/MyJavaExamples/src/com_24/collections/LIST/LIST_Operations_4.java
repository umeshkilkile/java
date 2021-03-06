package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author kilkile Iterating over a ArrayList
 */

public class LIST_Operations_4 {
	public static void main(String[] args) {
		List<String> listCountries = new ArrayList<String>();

		listCountries.add("India");
		listCountries.add("Finland");
		listCountries.add("Ireland");
		listCountries.add("America");
		listCountries.add("France");

		System.out.println("Before : " + listCountries);
		
		/*
		 * Snippet 1: Replacing
		 */
		replace(listCountries, "America", "Germany");
		System.out.println("After : " + listCountries);
		
		/*
		 * Snippet 2: Sublist
		 */
		System.out.println("Before : " + listCountries);
		List<String> sublist = listCountries.subList(0, 2);
		System.out.println("After : " + sublist);
		
		/*
		 * Snippet 2: Clear a sublist
		 */
		System.out.println("Before : " + listCountries);
		listCountries.subList(0, 2).clear();
		System.out.println("After : " + listCountries);
	}

	public static <E> void replace(List<E> list, E val, E newVal) {
		for (ListIterator<E> it = list.listIterator(); it.hasNext();)
			if (val == null ? it.next() == null : val.equals(it.next()))
				it.set(newVal);
	}
}
