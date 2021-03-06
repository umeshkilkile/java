package com_23.collections.SET;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Demo_2 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("Umesh");
		c.add("Sharada");
		c.add("Ananya");
		c.add("Umesh");

		System.out.println("Before removing duplicates c = " + c);

		Set<String> set1 = removeDups(c);
		System.out.println("set1 = " + set1);

		Collection<Employee> c2 = new ArrayList<>();
		Employee e1 = new Employee("Umesh", "Kilkile");
		Employee e2 = new Employee("Sathish", "Sirohi");
		Employee e3 = new Employee("Srivatsa", "Sharma");
		Employee e4 = new Employee("Umesh", "Kilkile");

		c2.add(e1);
		c2.add(e2);
		c2.add(e3);
		c2.add(e4);

		System.out.println("Before removing duplicates c2 = " + c2);

		Set<Employee> empSet3 = removeDups(c2);
		System.out.println("empSet3 = " + empSet3);

	}

	/*
	 * The following is a generic method that encapsulates the preceding idiom,
	 * returning a Set of the same generic type as the one passed.
	 */
	public static <E> Set<E> removeDups(Collection<E> c) {
		return new LinkedHashSet<E>(c);
	}
}
