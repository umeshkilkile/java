package com_23.collections.SET;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GenericMethodToRemoveDups_Demo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Umesh", "Kilkile"));
		list.add(new Employee("Anand", "Navale"));
		list.add(new Employee("Pradeep", "Kshirsagar"));
		list.add(new Employee("Mahesh", "Kilkile"));
		list.add(new Employee("Sachin", "Sakhare"));
		list.add(new Employee("Umesh", "Kilkile"));

		System.out.println("Before : " + list);

		Set<Employee> setWithoutDups = removeDups(list);
		System.out.println("After : " + setWithoutDups);
	}

	/*
	 * The following is a generic method that encapsulates the preceding idiom,
	 * returning a Set of the same generic type as the one passed.
	 */
	public static <E> Set<E> removeDups(Collection<E> c) {
		return new LinkedHashSet<E>(c);
	}
}
