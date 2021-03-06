package com.rtti;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class InstanceOf_Demo_12 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		System.out.println("list instanceof Iterable = " + (list instanceof Iterable));
		System.out.println("list instanceof Collection = " + (list instanceof Collection));
		System.out.println("list instanceof List = " + (list instanceof List));
		System.out.println("list instanceof ArrayList = " + (list instanceof ArrayList));
		System.out.println("list instanceof AbstractList = " + (list instanceof AbstractList));
		System.out.println("list instanceof RandomAccess = " + (list instanceof RandomAccess));
		System.out.println("list instanceof Cloneable = " + (list instanceof Cloneable));
		System.out.println("list instanceof Serializable = " + (list instanceof Serializable));
		System.out.println("list instanceof AbstractCollection = " + (list instanceof AbstractCollection));

		System.out.println("list instanceof LinkedList = " + (list instanceof LinkedList));

		/*
		 * The instanceof actually quietly does a second sanity check to see if
		 * the object is null, since instanceof produces false if the left-hand
		 * argument is null.
		 */
		System.out.println("list instanceof LinkedList = " + (null instanceof List));

	}
}
