package com_22.collections.COLLECTION;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

//All collections work with foreach.

public class ForEachCollections_Demo {
	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "Take the long way home".split(" "));
		for (String s : cs)
			System.out.print("‘" + s + "‘ ");
	}
}
/*
 * The reason that this works is that Java SE5 introduced a new interface called
 * Iterable which contains an iterator( ) method to produce an Iterator, and the
 * Iterable interface is what foreach uses to move through a sequence. So if you
 * create any class that implements Iterable, you can use it in a foreach
 * statement:
 */