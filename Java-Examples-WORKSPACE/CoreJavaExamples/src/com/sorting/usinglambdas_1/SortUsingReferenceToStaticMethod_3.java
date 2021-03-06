package com.sorting.usinglambdas_1;

import java.util.ArrayList;
import java.util.List;

public class SortUsingReferenceToStaticMethod_3 {
	public static void main(String[] args) {
		List<Human> humansList = new ArrayList<>();

		humansList.add(new Human("Sarah", 18));
		humansList.add(new Human("Jack", 12));

		System.out.println("Before sort humansList = " + humansList);

		/*
		 * sort using a Lambda Expression with a reference to a static method.
		 */
		humansList.sort(Human::compareByNameThenAge);
		System.out.println("\nAfter sort humansList = " + humansList);
	}
}
