package com_34.collections.wrapperimplementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex_2 {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Umesh";
		names[1] = "Ramesh";
		names[2] = "Neelesh";
		names[3] = "Anand";
		names[4] = "Jagadish";

		/*
		 * List view of an array
		 */
		/*List<String> namesList = Arrays.asList(names);
		System.out.println(namesList);
		System.out.println(namesList.size());
		namesList.add("Hi");*/
		
		/*
		 * Immutable Multiple-Copy List
		 */
		List<String> nCopies = new ArrayList<String>(Collections.nCopies(5, "Umesh"));
		System.out.println(nCopies.size());
		nCopies.addAll(Collections.nCopies(5, "Umesh-1"));
		System.out.println(nCopies);
		
		/*
		 * Immutable Singleton Set
		 */
		nCopies.removeAll(Collections.singleton("Umesh-1"));
		
		System.out.println(nCopies);
	}
}
