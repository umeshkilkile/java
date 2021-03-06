package com_38.collections.SORTED_MAP;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMap_Demo_1 {
	public static void main(String[] args) {
		NavigableMap<String, String> capitalCountry = new TreeMap<String, String>();
		capitalCountry.put("France", "Paris");
		capitalCountry.put("India", "Delhi");
		capitalCountry.put("India", "Delhi");
		capitalCountry.put("Germany", "Berlin");
		capitalCountry.put("Finland", "Helsinki");
		capitalCountry.put("Russia", "Mascow");

		NavigableSet reverse = capitalCountry.descendingKeySet();
		System.out.println(reverse);

		NavigableMap descending = capitalCountry.descendingMap();
		System.out.println(descending);

		NavigableMap original = new TreeMap();
		original.put("1", "1");
		original.put("2", "2");
		original.put("3", "3");

		// this headmap1 will contain "1" and "2"
		SortedMap headmap1 = original.headMap("3");
		System.out.println(headmap1);

		// this headmap2 will contain "1", "2", and "3" because "inclusive"=true
		NavigableMap headmap2 = original.headMap("3", true);
		System.out.println(headmap2);
	}
}

/*
 * - The java.util.NavigableMap interface is a subtype of the
 * java.util.SortedMap interface. It has a few extensions to the SortedSet which
 * makes it possible to navigate the map.
 * 
 * - The java.util package only has one implementation of the NavigableMap
 * interface: java.util.TreeMap
 */