package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RemoveTraversingCollections_5 {
	public static void main(String[] args) {
		Collection<Employee> collection = new ArrayList<Employee>();

		Employee emp1 = new Employee("Umesh", "Kilkile", 1000);
		Employee emp2 = new Employee("Ramesh", "KTG", 2000);
		Employee emp3 = new Employee("Anand", "Navale", 1000);
		Employee emp4 = new Employee("Vijay", "H", 1000);

		collection.add(emp1);
		collection.add(emp2);
		collection.add(emp3);
		collection.add(emp4);

		System.out.println("Before remove = " + collection);
		filter(collection);
		System.out.println("After remove = " + collection);
	}

	/*
	 * Use Iterator instead of the for-each construct when you need to:
	 * 
	 * 1. Remove the current element. The for-each construct hides the iterator,
	 * so you cannot call remove. Therefore, the for-each construct is not
	 * usable for filtering.
	 * 
	 * 2. Iterate over multiple collections in parallel.
	 */
	public static void filter(Collection<Employee> c) {
		for (Iterator<Employee> it = c.iterator(); it.hasNext();) {
			if (it.next() != null) {
				it.remove();
			}
		}
	}
}
