package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CrossContainerIteration_Demo {
	// display( ) method that is container-agnostic
	public static void display(Iterator<String> it) {
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		List<String> compsList = Arrays.asList("Accenture", "Boeing", "Citrix", "Dell", "EMC");
		ArrayList<String> companiesAL = new ArrayList<String>(compsList);
		LinkedList<String> companiesLL = new LinkedList<String>(compsList);
		HashSet<String> companiesHS = new HashSet<String>(compsList);
		TreeSet<String> companiesTS = new TreeSet<String>(compsList);
		display(companiesAL.iterator());
		display(companiesLL.iterator());
		display(companiesHS.iterator());
		display(companiesTS.iterator());
	}
}
/*
 * Note that display( ) contains no information about the type of sequence that
 * it is traversing, and this shows the true power of the Iterator: the ability
 * to separate the operation of traversing a sequence from the underlying
 * structure of that sequence.
 */