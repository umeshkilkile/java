package com_30.collections.OBJECT_ORDERING.COMPARATOR_INTERFACE;

import java.util.Comparator;

/* The Comparator interface
 * 
 * public interface Comparator<T> {
 * int compare(T o1, T o2);
 }
 */
public class Emp_FirstName_Comparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getFirstName().compareTo(emp2.getFirstName());
	}

}
