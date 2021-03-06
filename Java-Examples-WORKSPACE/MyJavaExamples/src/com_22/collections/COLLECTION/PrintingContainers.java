package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PrintingContainers {
	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}

	static Map fill(Map<String, String> map) {
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}

	public static void main(String[] args) {
		System.out.println("ArrayList -> " + fill(new ArrayList<String>()));
		System.out.println("LinkedList -> " + fill(new LinkedList<String>()));
		System.out.println("HashSet -> " + fill(new HashSet<String>()));
		System.out.println("TreeSet -> " + fill(new TreeSet<String>()));
		System.out.println("LinkedHashSet -> " + fill(new LinkedHashSet<String>()));
		System.out.println("HashMap -> " + fill(new HashMap<String, String>()));
		System.out.println("TreeMap -> " + fill(new TreeMap<String, String>()));
		System.out.println("LinkedHashMap -> " + fill(new LinkedHashMap<String, String>()));
	}
}
/*
 * - ArrayList and LinkedList are both types of List, and you can see from the
 * output that they both hold elements in the same order in which they are
 * inserted. The difference between the two is not only performance for certain
 * types of operations, but also that a LinkedList contains more operations than
 * an ArrayList.
 * 
 * - HashSet, TreeSet and LinkedHashSet are types of Set. The output shows that
 * a Set will only hold one of each identical item, but it also shows that the
 * different Set implementations store the elements differently. The HashSet
 * stores elements using a rather complex approach ,all you need to know at this
 * point is that this technique is the fastest way to retrieve elements, and as
 * a result the storage order can seem nonsensical (often, you only care whether
 * something is a member of the Set, not the order in which it appears). If
 * storage order is important, you can use a TreeSet, which keeps the objects in
 * ascending comparison order, or a LinkedHashSet, which keeps the objects in
 * the order in which they were added.
 * 
 * - The example uses the three basic flavors of Map: HashMap, TreeMap and
 * LinkedHashMap. Like HashSet, HashMap provides the fastest lookup technique,
 * and also doesn�t hold its elements in any apparent order. A TreeMap keeps the
 * keys sorted by ascending comparison order, and a LinkedHashMap keeps the keys
 * in insertion order while retaining the lookup speed of the HashMap.
 */
