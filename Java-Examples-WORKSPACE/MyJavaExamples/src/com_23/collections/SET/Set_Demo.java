package com_23.collections.SET;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Set_Demo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("Umesh");
		c.add("Sharada");
		c.add("Ananya");
		c.add("Umesh");

		System.out.println("Before removing duplicates = " + c);

		/*
		 * Suppose you have a Collection, c, and you want to create another
		 * Collection containing the same elements but with all duplicates
		 * eliminated. The following one-liner does the trick.
		 */
		Collection<String> noDups = new HashSet<>(c);
		System.out.println("After removing duplicates = " + noDups);

		// Using JDK 1.8 or later, you could easily collect into a Set using
		// aggregate operations:
		Collection<String> noDups2 = c.stream().collect(Collectors.toSet());
		System.out.println("After removing duplicates2 = " + noDups2);

		Collection<Employee> c2 = new ArrayList<>();
		Employee e1 = new Employee("Umesh", "Kilkile");
		Employee e2 = new Employee("Sathish", "Sirohi");
		Employee e3 = new Employee("Srivatsa", "Sharma");
		Employee e4 = new Employee("Umesh", "Kilkile");

		c2.add(e1);
		c2.add(e2);
		c2.add(e3);
		c2.add(e4);

		System.out.println("c2 = " + c2);

		/*
		 * Example that accumulates a Collection of names into a TreeSet:
		 */
		Set<String> empSet = c2.stream().map(Employee::getFirstName).collect(Collectors.toCollection(TreeSet::new));
		System.out.println("empSet = " + empSet);

		/*
		 * Following is a minor variant of the first idiom that preserves the
		 * order of the original collection while removing duplicate elements:
		 */
		Set<Employee> empSet2 = new LinkedHashSet<>(c2);
		System.out.println("empSet2 = " + empSet2);
	}
}
