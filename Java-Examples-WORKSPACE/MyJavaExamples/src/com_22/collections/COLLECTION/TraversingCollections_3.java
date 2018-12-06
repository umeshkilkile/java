package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

/*
 * There are three ways to traverse collections: (1) using aggregate operations (2) with the for-each construct and 
 * (3) by using Iterators.
 */
public class TraversingCollections_3 {
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

		System.out.println(collection);

		/*
		 * 1. Using Aggregate Operations (Java 8)
		 */
		int totalSal = collection.stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("Total Salary : " + totalSal);
		System.out.println();

		/*
		 * Likewise, you could easily request a parallel stream, which might
		 * make sense if the collection is large enough and your computer has
		 * enough cores:
		 */
		int totalSalary = collection.parallelStream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("Total Salary : " + totalSalary);
		System.out.println();

		/*
		 * 2. Using for-each Construct
		 */
		for (Employee e : collection) {
			System.out.println(e.getFirstName() + " : " + e.getLastName() + " : " + e.getSalary());
		}
		System.out.println();

		/*
		 * 3. Using Iterator
		 * 
		 * - An Iterator is an object that enables you to traverse through a
		 * collection and to remove elements from the collection selectively, if
		 * desired.
		 * 
		 * - Note that Iterator.remove is the only safe way to modify a
		 * collection during iteration; the behavior is unspecified if the
		 * underlying collection is modified in any other way while the
		 * iteration is in progress.
		 * 
		 * Use Iterator instead of the for-each construct when you need to:
		 * 
		 * - Remove the current element. The for-each construct hides the
		 * iterator, so you cannot call remove. Therefore, the for-each
		 * construct is not usable for filtering.
		 * 
		 * - Iterate over multiple collections in parallel.
		 */
		for (Iterator<Employee> empIterator = collection.iterator(); empIterator.hasNext();) {
			Employee emp = empIterator.next();
			System.out.println(emp.getFirstName() + " : " + emp.getLastName() + " : " + emp.getSalary());
		}
	}
}
