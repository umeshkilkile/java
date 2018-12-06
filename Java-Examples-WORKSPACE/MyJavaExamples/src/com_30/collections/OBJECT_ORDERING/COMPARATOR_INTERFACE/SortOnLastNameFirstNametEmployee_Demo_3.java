package com_30.collections.OBJECT_ORDERING.COMPARATOR_INTERFACE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortOnLastNameFirstNametEmployee_Demo_3 {
	public static void main(String[] args) {

		List<Employee_3> listEmployee = new ArrayList<Employee_3>();
		listEmployee.add(new Employee_3("ZZZZ", "AAAA"));
		listEmployee.add(new Employee_3("XXXX", "BBBB"));
		listEmployee.add(new Employee_3("WWWW", "AAA"));
		listEmployee.add(new Employee_3("YYYY", "EEEE"));
		listEmployee.add(new Employee_3("VVVV", "DDDD"));

		System.out.println("Before sort : " + listEmployee);

		/*
		 * Snippet-1: Using Comparator object
		 */
		Collections.sort(listEmployee, new EmpLastNameFirstNameComp());
		System.out.println("After sort on last name than first name : " + listEmployee);

		List<Employee_3> listEmployee2 = new ArrayList<Employee_3>();
		listEmployee2.add(new Employee_3("ZZZZ", "AAAA"));
		listEmployee2.add(new Employee_3("XXXX", "BBBB"));
		listEmployee2.add(new Employee_3("WWWW", "AAA"));
		listEmployee2.add(new Employee_3("YYYY", "EEEE"));
		listEmployee2.add(new Employee_3("VVVV", "DDDD"));

		System.out.println("Before sort : " + listEmployee);
		
		List<Employee_3> sortedList = sortLastNameFirstName(listEmployee2);
		
		System.out.println("After lastname and firstname sort : " + sortedList);
	}

	/*
	 * Using java 8
	 */
	public static List<Employee_3> sortLastNameFirstName(List<Employee_3> list2) {
		return list2.stream()
				.sorted(Comparator.comparing(Employee_3::getLastName).thenComparing(Employee_3::getFirstName))
				.collect(Collectors.toList());
	}
}
