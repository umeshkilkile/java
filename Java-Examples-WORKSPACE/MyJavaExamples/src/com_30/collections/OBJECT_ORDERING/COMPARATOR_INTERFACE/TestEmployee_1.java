package com_30.collections.OBJECT_ORDERING.COMPARATOR_INTERFACE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee_1 {
	public static void main(String[] args) {
		
		
		List<Employee> listEmployee = new ArrayList<Employee>();
		listEmployee.add(new Employee("Umesh","Kilkile"));
		listEmployee.add(new Employee("Anand","Navale"));
		listEmployee.add(new Employee("Pradeep","Kshirsagar"));
		listEmployee.add(new Employee("Mahesh","Kilkile"));
		listEmployee.add(new Employee("Sachin","Sakhare"));
		
		System.out.println("Before sort : " + listEmployee);
		
		/*
		 * Snippet-1: Using Comparator object
		 */
		Collections.sort(listEmployee, new Emp_FirstName_Comparator());
		System.out.println("After sort on first name : " + listEmployee);
		
		
		/*
		 * Snippet-2: Using Comparator object
		 */
		List<Employee> listEmployee2 = new ArrayList<Employee>();
		listEmployee2.add(new Employee("Umesh","Kilkile"));
		listEmployee2.add(new Employee("Anand","Navale"));
		listEmployee2.add(new Employee("Pradeep","Kshirsagar"));
		listEmployee2.add(new Employee("Mahesh","Kilkile"));
		listEmployee2.add(new Employee("Sachin","Sakhare"));
		listEmployee2.add(new Employee("Umesh","Kilkile"));
		
		System.out.println("Before sort : " + listEmployee2);
		
		final Comparator<Employee> EMP_LAST_NAME_ASCENDING = new Comparator<Employee>() {
			public int compare(Employee emp1, Employee emp2){
				return emp1.getLastName().compareTo(emp2.getLastName());
			}
		};

		final Comparator<Employee> EMP_LAST_NAME_DESCENDNG = new Comparator<Employee>() {
			public int compare(Employee emp1, Employee emp2){
				return emp2.getLastName().compareTo(emp1.getLastName());
			}
		};

		
		Collections.sort(listEmployee2, EMP_LAST_NAME_DESCENDNG);
		System.out.println("After sort on lastname : " + listEmployee2);
	}
}
