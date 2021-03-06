package com_22.collections.COLLECTION;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDataTest_Demo_2 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 15));
		System.out.println(set);
		// Using the convenience method:
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
	}
}
/*
 * The elements are in the same order in which they are inserted because a
 * LinkedHashSet maintains a linked list holding the insertion order.
 */