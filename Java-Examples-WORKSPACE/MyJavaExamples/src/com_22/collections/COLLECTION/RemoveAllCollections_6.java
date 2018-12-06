package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RemoveAllCollections_6 {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();

		collection.add("Ananya");
		collection.add("Umesh");
		collection.add("Ananya");
		collection.add("Sharada");
		collection.add(null);

		System.out.println("Before remove = " + collection);

		/*
		 * Collections.singleton, which is a static factory method that returns
		 * an immutable Set containing only the specified element.
		 */
		collection.removeAll(Collections.singleton("Ananya"));
		System.out.println("After remove = " + collection);

		collection.removeAll(Collections.singleton(null));
		System.out.println("After remove nulls = " + collection);
	}

}
