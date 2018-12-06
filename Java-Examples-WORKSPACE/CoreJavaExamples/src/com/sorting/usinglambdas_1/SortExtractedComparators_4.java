package com.sorting.usinglambdas_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExtractedComparators_4 {
	public static void main(String[] args) {
		List<Human> humansList = new ArrayList<>();

		humansList.add(new Human("Umesh", 30));
		humansList.add(new Human("Ananya", 1));
		humansList.add(new Human("Sharada", 25));

		System.out.println("Before sort humansList = " + humansList);

		/*
		 * We can also avoid defining even the comparison logic itself by using
		 * an instance method reference and the Comparator.comparing method –
		 * which extracts and creates a Comparable based on that function.
		 * 
		 * We’re going to use the getter getAge() to build the Lambda expression
		 * and sort the list by name:
		 */
		Collections.sort(humansList, Comparator.comparing(Human::getAge));
		System.out.println("\nAfter sort on age -  humansList = " + humansList);

		/*
		 * We’re going to use the getter getName() to build the Lambda
		 * expression and sort the list by name:
		 */
		Collections.sort(humansList, Comparator.comparing(Human::getName));
		System.out.println("\nAfter sort on name -  humansList = " + humansList);
	}
}
