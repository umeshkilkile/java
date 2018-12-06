package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LIST_Operations_7_1 {
	public static void main(String[] args) {
		List<Employee> list1 = new ArrayList<Employee>();

		list1.add(new Employee("Umesh", "Kilkile"));
		list1.add(new Employee("Anand", "Navale"));
		list1.add(new Employee("Pradeep", "Kshirsagar"));
		list1.add(new Employee("Mahesh", "Kilkile"));
		list1.add(new Employee("Sachin", "Sakhare"));
		list1.add(new Employee("Umesh", "Kilkile"));
		System.out.println("list1 = " + list1);

		List<Employee> list2 = new ArrayList<Employee>();
		list2.add(new Employee("Adarsh", "D"));
		list2.add(new Employee("Avinash", "Yadav"));
		System.out.println("list2 = " + list2);

		// The following idiom concatenates one list to another.
		list1.addAll(list2);
		System.out.println("list1 = " + list1);

		/*
		 * A nondestructive form of this idiom, which produces a third List
		 * consisting of the second list appended to the first
		 */
		List<Employee> list3 = new ArrayList<Employee>(list1);
		list3.addAll(list2);
		System.out.println("list3 = " + list3);

		/*
		 * An example (JDK 8 and later) that aggregates some names into a List
		 */
		List<String> empNames = list3.stream().map(Employee::getFirstName).collect(Collectors.toList());
		System.out.println(empNames);
	}
}
