package com_23.collections.SET;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Set_Demo_3 {
	public static void main(String[] args) {
		Collection<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee("Umesh", "Kilkile"));
		employeeList.add(new Employee("Anand", "Navale"));
		employeeList.add(new Employee("Pradeep", "Kshirsagar"));
		employeeList.add(new Employee("Mahesh", "Kilkile"));
		employeeList.add(new Employee("Sachin", "Sakhare"));
		employeeList.add(new Employee("Umesh", "Kilkile"));

		System.out.println("In List : " + employeeList);

		/*
		 * Simple Set idiom to remove duplicates
		 */
		Collection<Employee> noDups = new HashSet<Employee>(employeeList);
		System.out.println("Without duplicates : " + noDups);

		/*
		 * And the following is a minor variant of the first idiom that
		 * preserves the order of the original collection while removing
		 * duplicate elements:
		 */
		Collection<Employee> noDups3 = new LinkedHashSet<Employee>(employeeList);
		System.out.println("Without duplicates but ordered : " + noDups3);
		
		/*
		 * And the following is a minor variant of the first idiom that
		 * preserves the order of the original collection while removing
		 * duplicate elements:
		 */
		Collection<Employee> noDups4 = new TreeSet<Employee>(employeeList);
		System.out.println("Without duplicates but ordered in ascending : " + noDups4);

		/*
		 * Simple Set idiom to remove duplicates in Java 8. You could easily
		 * collect into a Set using aggregate operations:
		 */
		Collection<Employee> noDups2 = employeeList.stream().collect(Collectors.toSet());
		System.out.println("Without duplicates (Java 8) : " + noDups2);

		/*
		 * Here's a slightly longer example that accumulates a Collection of
		 * firstnames into a TreeSet:
		 */
		Set<String> onlyFirstNameSet = (Set<String>) employeeList.stream().map(Employee::getFirstName).collect(Collectors.toCollection(TreeSet::new));
		System.out.println("onlyFirstNameSet : " + onlyFirstNameSet);
	}
}
