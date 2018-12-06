package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LIST_With_Custom_Objects_5 {
	public static void main(String[] args) {

		/*
		 * Snippet-1 : Using ArrayList
		 */
		List<Employee> employeeArrayList = new ArrayList<Employee>();

		employeeArrayList.add(new Employee("Umesh", "Kilkile"));
		employeeArrayList.add(new Employee("Anand", "Navale"));
		employeeArrayList.add(new Employee("Pradeep", "Kshirsagar"));
		employeeArrayList.add(new Employee("Mahesh", "Kilkile"));
		employeeArrayList.add(new Employee("Sachin", "Sakhare"));
		employeeArrayList.add(new Employee("Umesh", "Kilkile"));

		System.out.println("Employees in ArrayList : " + employeeArrayList);

		System.out.println("Iterated with Iterator\n");
		for (Iterator<Employee> empIterator = employeeArrayList.iterator(); empIterator.hasNext();) {
			System.out.println(empIterator.next());
		}
		/*
		 * Snippet-2 : Using LinkedList
		 */
		List<Employee> employeeLinkedList = new LinkedList<Employee>();

		employeeLinkedList.add(new Employee("Umesh", "Kilkile"));
		employeeLinkedList.add(new Employee("Anand", "Navale"));
		employeeLinkedList.add(new Employee("Pradeep", "Kshirsagar"));
		employeeLinkedList.add(new Employee("Mahesh", "Kilkile"));
		employeeLinkedList.add(new Employee("Sachin", "Sakhare"));
		employeeLinkedList.add(new Employee("Umesh", "Kilkile"));

		System.out.println("Employees in LinkedList : " + employeeLinkedList);

		System.out.println("Iterated with Iterator\n");
		for(Iterator<Employee> empIterator2 = employeeLinkedList.iterator(); empIterator2.hasNext();){
			System.out.println(empIterator2.next());
		}
	}
}
