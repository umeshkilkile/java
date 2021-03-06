package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LIST_Remove_Dups_From_List_2 {
	public static void main(String[] args) {
		List<String> listWithDups = new ArrayList<String>();

		listWithDups.add("India");
		listWithDups.add("France");
		listWithDups.add("Germany");
		listWithDups.add("Finland");
		listWithDups.add("New Zealand");
		listWithDups.add("India");
		listWithDups.add("Singapore");
		listWithDups.add("India");
		listWithDups.add("India");

		System.out.println("List with duplicates : " + listWithDups);

		/*
		 * Does not preserves the order of the original collection while removing duplicate elements
		 */
		Set<String> setWithoutDups = new HashSet<String>(listWithDups);
		System.out.println("Set without duplicates in HashSet : " + setWithoutDups);
		
		
		/*
		 * Preserves the order of the original collection while removing duplicate elements
		 */
		Set<String> setWithoutDups2 = new LinkedHashSet<String>(listWithDups);
		System.out.println("Set without duplicates in LinkedHashSet : " + setWithoutDups2);

	}
}
