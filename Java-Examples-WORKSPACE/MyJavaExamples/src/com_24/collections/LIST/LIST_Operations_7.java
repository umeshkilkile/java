package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LIST_Operations_7 {
	public static void main(String[] args) {
		/*Collection<Employee> employeeArrayList = new ArrayList<Employee>();

		employeeArrayList.add(new Employee("Umesh", "Kilkile"));
		employeeArrayList.add(new Employee("Anand", "Navale"));
		employeeArrayList.add(new Employee("Pradeep", "Kshirsagar"));
		employeeArrayList.add(new Employee("Mahesh", "Kilkile"));
		employeeArrayList.add(new Employee("Sachin", "Sakhare"));
		employeeArrayList.add(new Employee("Umesh", "Kilkile"));

		System.out.println("Employees in Collection : " + employeeArrayList);
		
		List<String> firstNames = employeeArrayList.stream().map(Employee::getFirstName).collect(Collectors.toList());
		System.out.println("Employees firstNames : " + firstNames);
		
		List<String> lastNames = employeeArrayList.stream().map(Employee::getLastName).collect(Collectors.toList());
		System.out.println("Employees lastNames : " + lastNames);*/
		
		/*
		 * equals() and hashCode() methods on list
		 */
		List<Employee> list1 = new ArrayList<Employee>();

		list1.add(new Employee("Umesh", "Kilkile"));
		list1.add(new Employee("Anand", "Navale"));
		System.out.println(list1);
		
		List<Employee> list2 = new ArrayList<Employee>();

		list2.add(new Employee("Umesh", "Kilkile"));
		list2.add(new Employee("Anand", "Navale"));
		System.out.println(list2);
		
		System.out.println(list1.equals(list2));
		System.out.println(list1.hashCode() == list2.hashCode());
		
	}
}
