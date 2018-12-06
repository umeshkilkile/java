package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class CollectionInterface_Ex_0 {
	public static void main(String[] args) {
		// More generality
		Collection<String> c = new Vector<>();
		c.add("Umesh");
		c.add("Ananya");

		List<String> list = new ArrayList<String>(c);
		System.out.println(list);

		List<String> list2 = new ArrayList(c);
		System.out.println(list2);

	}
}