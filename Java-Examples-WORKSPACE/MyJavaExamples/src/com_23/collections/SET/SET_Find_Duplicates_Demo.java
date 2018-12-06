package com_23.collections.SET;

import java.util.HashSet;
import java.util.Set;

public class SET_Find_Duplicates_Demo {
	public static void main(String[] args) {

		String str[] = { "I", "Came", "I", "Saw", "I", "Left" };

		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();

		for (String a : str) {
			if (!uniques.add(a))
				dups.add(a);
		}

		System.out.println("Unique words:    " + uniques);
		System.out.println("Duplicate word: " + dups);
		System.out.println("---------------------------------");

		// Destructive set-difference
		uniques.removeAll(dups);

		System.out.println("Unique words:    " + uniques);
		System.out.println("Duplicate word: " + dups);
	}
}
