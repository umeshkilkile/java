package com_29.collections.OBJECT_ORDERING.COMPARABLE_INTERFACE;

import java.util.ArrayList;
import java.util.Collections;
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
		
		Collections.sort(listEmployee);
		
		System.out.println("After sort : " + listEmployee);
	}
}
