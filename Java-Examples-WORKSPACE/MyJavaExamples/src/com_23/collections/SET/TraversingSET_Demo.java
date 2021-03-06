package com_23.collections.SET;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class TraversingSET_Demo {
	public static void main(String[] args) {
		Collection<Employee> collection = new ArrayList<Employee>();

		Employee emp1 = new Employee("Umesh", "Kilkile");
		Employee emp2 = new Employee("Ramesh", "KTG");
		Employee emp3 = new Employee("Anand", "Navale");
		Employee emp4 = new Employee("Umesh", "Kilkile");

		collection.add(emp1);
		collection.add(emp2);
		collection.add(emp3);
		collection.add(emp4);

		System.out.println("All employees : " + collection);

		/*
		 * 1. Using Aggregate Operations (Java 8)
		 */
		Set<Employee> distinctEmp = collection.stream().collect(Collectors.toSet());
		System.out.println("Distinct employees : " + distinctEmp);
		System.out.println();
		
		/*
		 * 2. Using for-each Construct
		 */
		for (Employee e : distinctEmp) {
			System.out.println(e.getFirstName() + " : " + e.getLastName());
		}
		System.out.println();
		
		/*
		 * 3. Using Iterator
		 */
		for (Iterator<Employee> empIterator = distinctEmp.iterator(); empIterator.hasNext();) {
			Employee emp = empIterator.next();
			System.out.println(emp.getFirstName() + " : " + emp.getLastName());
		}
	}
}
