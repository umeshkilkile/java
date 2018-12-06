package com_31.collections.SORTED_SET_INTERFACE;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSet_Ex_2 {
	public static void main(String[] args) {
		NavigableSet<Employee> employees = new TreeSet<Employee>();
		employees.add(new Employee("Umesh", "Kilkile"));
		employees.add(new Employee("Srishail", "Tengli"));
		employees.add(new Employee("Anand", "Navale"));
		employees.add(new Employee("Ramesh", "KTG"));
		employees.add(new Employee("Umesh", "Kilkile"));

		System.out.println(employees);

		/*
		 * The descendingSet() method returns a NavigableSet in which the order
		 * of the elements is reversed compared to this one. The returned "view"
		 * is backed by the original NavigableSet, so changes to the descending
		 * set are also reflected in the original set.
		 */
		NavigableSet<Employee> employees2 = employees.descendingSet();
		System.out.println(employees2);

		/*
		 * The descendingIterator() method allows you to iterate the elements of
		 * the NavigableSet (which is also a SortedSet) in reverse order,
		 * without changing the order of the elements internally.
		 */
		Iterator<Employee> reverseItr = employees.descendingIterator();
		while (reverseItr.hasNext()) {
			System.out.println(reverseItr.next());
		}

		/*
		 * The headSet() method returns a view of the original NavigableSet
		 * which only contains elements that are "less than" the given element.
		 */
		SortedSet<Employee> emp = employees.headSet(new Employee("Umesh", "Kilkile"));
		System.out.println(emp);

		/*
		 * The tailSet() method works the same way, except it returns all
		 * elements that are higher than the given parameter element.
		 */
		SortedSet<Employee> emp1 = employees.tailSet(new Employee("Umesh", "Kilkile"));
		System.out.println(emp1);

		/*
		 * The subSet() allows you to pass two parameters demarcating the
		 * boundaries of the view set to return. The elements matching the first
		 * boundary is included, where as elements matching the last boundary
		 * are not.
		 */
		SortedSet<Employee> emp2 = employees.subSet(new Employee("Umesh", "Kilkile"), new Employee("Umesh", "Kilkile"));
		System.out.println(emp2);
	}
}
