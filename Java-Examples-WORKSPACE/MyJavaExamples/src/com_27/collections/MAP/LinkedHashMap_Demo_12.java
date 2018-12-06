package com_27.collections.MAP;

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo_12 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>(new CountingMapData_Demo_10(9));
		System.out.println("linkedMap = " + linkedMap);
		// Least-recently-used order:
		linkedMap = new LinkedHashMap<Integer, String>(16, 0.75f, true);
		linkedMap.putAll(new CountingMapData_Demo_10(9));
		System.out.println(linkedMap);
		for (int i = 0; i < 6; i++) // Cause accesses:
			linkedMap.get(i);
		System.out.println(linkedMap);
		linkedMap.get(0);
		System.out.println(linkedMap);
	}
}
/*
 * You can see from the output that the pairs are indeed traversed in insertion
 * order, even for the LRU version. However, after the first six items (only)
 * are accessed in the LRU version, the last three items move to the front of
 * the list. Then, when "o" is accessed again, it moves to the back of the list.
 */