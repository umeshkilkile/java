package com.sorting.usinglambdas_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicSortWithoutLambdas_1 {
	public static void main(String[] args) {
		List<Human> humansList = new ArrayList<>();

		humansList.add(new Human("Sarah", 18));
		humansList.add(new Human("Jack", 12));

		System.out.println("Before sort humansList = " + humansList);

		/*
		 * Before Java 8, sorting a collection would involve creating an
		 * anonymous inner class for the Comparator used in the sort:
		 */
		Collections.sort(humansList, new Comparator<Human>() {
			@Override
			public int compare(Human o1, Human o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("\nAfter sort humansList = " + humansList);
	}

}
