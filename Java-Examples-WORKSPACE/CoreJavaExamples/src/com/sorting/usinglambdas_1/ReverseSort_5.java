package com.sorting.usinglambdas_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReverseSort_5 {
	public static void main(String[] args) {
		List<Human> humansList = new ArrayList<>();

		humansList.add(new Human("Umesh", 30));
		humansList.add(new Human("Ananya", 1));
		humansList.add(new Human("Sharada", 25));

		System.out.println("Before sort humansList = " + humansList);

		Comparator<Human> comparator = (h1, h2) -> h1.getName().compareTo(h2.getName());
		humansList.sort(comparator);
		System.out.println("\nAfter sort -  humansList = " + humansList);

		/*
		 * JDK 8 has also introduced a helper method for reversing the
		 * comparator � we can make quick use of that to reverse our sort:
		 */
		humansList.sort(comparator.reversed());
		System.out.println("\nAfter reverse sort -  humansList = " + humansList);
		
		humansList.sort(comparator.reversed().thenComparing(Human::getAge));
		System.out.println("\nAfter reverse sort2 -  humansList = " + humansList);
	}
}
