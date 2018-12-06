package com_23.collections.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_With_Custom_Objects_Demo {
	public static void main(String[] args) {

		/*
		 * Snippet-1 : Using HashSet
		 */
		Set<Employee> employeeHashSet = new HashSet<Employee>();

		employeeHashSet.add(new Employee("Umesh", "Kilkile"));
		employeeHashSet.add(new Employee("Anand", "Navale"));
		employeeHashSet.add(new Employee("Pradeep", "Kshirsagar"));
		employeeHashSet.add(new Employee("Mahesh", "Kilkile"));
		employeeHashSet.add(new Employee("Sachin", "Sakhare"));
		employeeHashSet.add(new Employee("Umesh", "Kilkile"));

		System.out.println("In HashSet : " + employeeHashSet);

		/*
		 * Snippet-2 : Using TreeSet
		 */
		Set<Employee> employeeTreeSet = new TreeSet<Employee>();

		employeeTreeSet.add(new Employee("Umesh", "Kilkile"));
		employeeTreeSet.add(new Employee("Anand", "Navale"));
		employeeTreeSet.add(new Employee("Pradeep", "Kshirsagar"));
		employeeTreeSet.add(new Employee("Mahesh", "Kilkile"));
		employeeTreeSet.add(new Employee("Sachin", "Sakhare"));
		employeeTreeSet.add(new Employee("Umesh", "Kilkile"));

		System.out.println("In TreeSet : " + employeeTreeSet);

		/*
		 * Snippet-3 : Using LinkedHashSet
		 */
		Set<Employee> employeeLinkedHashSet = new LinkedHashSet<Employee>();

		employeeLinkedHashSet.add(new Employee("Umesh", "Kilkile"));
		employeeLinkedHashSet.add(new Employee("Anand", "Navale"));
		employeeLinkedHashSet.add(new Employee("Pradeep", "Kshirsagar"));
		employeeLinkedHashSet.add(new Employee("Mahesh", "Kilkile"));
		employeeLinkedHashSet.add(new Employee("Sachin", "Sakhare"));
		employeeLinkedHashSet.add(new Employee("Umesh", "Kilkile"));

		System.out.println("In LinkedHashSet : " + employeeLinkedHashSet);

	}
}
