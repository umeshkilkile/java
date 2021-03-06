package com.sorting.usinglambdas_1;

import java.util.ArrayList;
import java.util.List;

public class BasicSortWithoutLambdasSupport_2 {
	public static void main(String[] args) {
		List<Human> humansList = new ArrayList<>();

		humansList.add(new Human("Sarah", 18));
		humansList.add(new Human("Jack", 12));

		System.out.println("Before sort humansList = " + humansList);

		/*
		 * With the introduction of Lambdas, we can now bypass the anonymous
		 * inner class and go achieve the same result with simple, functional
		 * semantics:
		 * 
		 * Notice that we�re also using the new sort API added to java.util.List
		 * in Java 8 � instead of the old Collections.sort API.
		 */

		humansList.sort((Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));
		System.out.println("\nAfter sort humansList = " + humansList);

		/*
		 * We can further simplify the expression by not specifying the type
		 * definitions � the compiler is capable of inferring these on its own:
		 */
		humansList.add(new Human("Amith", 17));
		
		humansList.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));
		System.out.println("\nAfter sort again humansList = " + humansList);

	}

}
