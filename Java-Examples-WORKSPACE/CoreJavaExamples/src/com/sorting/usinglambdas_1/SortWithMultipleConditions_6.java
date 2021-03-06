package com.sorting.usinglambdas_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortWithMultipleConditions_6 {
	public static void main(String[] args) {
		List<Human> humansList = new ArrayList<>();

		humansList.add(new Human("Umesh", 30));
		humansList.add(new Human("Umesh", 20));
		humansList.add(new Human("Sharada", 25));

		System.out.println("Before sort humansList = " + humansList);

		/*
		 * The comparison lambda expressions need not be this simple � we can
		 * write more complex expressions as well � for example sorting the
		 * entities first by name, and then by age:
		 */
		humansList.sort((lhs, rhs) -> {
			if (lhs.getName().equals(rhs.getName())) {
				return lhs.getAge() - rhs.getAge();
			} else {
				return lhs.getName().compareTo(rhs.getName());
			}
		});
		System.out.println("\nAfter sort -  humansList = " + humansList);

		/*
		 * The same comparison logic � first sorting by name and then,
		 * secondarily, by age � can also be implemented by the new composition
		 * support for Comparator.
		 * 
		 * Starting with JDK 8, we can now chain together multiple comparators
		 * to build more complex comparison logic:
		 */
		humansList.sort(Comparator.comparing(Human::getName).thenComparing(Human::getAge));
		System.out.println("\nAfter complex sort -  humansList = " + humansList);
	}
}
