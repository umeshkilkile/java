package com_31.collections.SORTED_SET_INTERFACE;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Ex1 {
	public static void main(String[] args) {
		
		SortedSet<Employee> employees = new TreeSet<Employee>();
		employees.add(new Employee("Umesh", "Kilkile"));
		employees.add(new Employee("Srishail", "Tengli"));
		employees.add(new Employee("Anand", "Navale"));
		employees.add(new Employee("Ramesh", "KTG"));
		employees.add(new Employee("Umesh", "Kilkile"));
		
		System.out.println(employees);
		
		SortedSet<Employee> set2 = employees.subSet(new Employee("Ramesh", "KTG"),(new Employee("Umesh", "Kilkile")));
		System.out.println(set2);
	}
}
