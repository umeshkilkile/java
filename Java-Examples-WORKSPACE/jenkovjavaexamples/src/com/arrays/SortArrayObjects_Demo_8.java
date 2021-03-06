package com.arrays;

import java.util.Comparator;

/*
 * - Objects may not have any natural sort order, so you need to provide another object which is capable of determining 
 * the order of your objects. Such an object is called a Comparator.
 * 
 * - The Comparator is an interface.
 */
public class SortArrayObjects_Demo_8 {
	public static void main(String[] args) {
		Employee[] employeeArray = new Employee[3];

		employeeArray[0] = new Employee("Xander", 1);
		employeeArray[1] = new Employee("John", 3);
		employeeArray[2] = new Employee("Anna", 2);

		/*
		 * - Sorting an array of Employee objects by their name using the
		 * Arrays.sort() method:
		 * 
		 * - An anonymous implementation of the Comparator interface.
		 */
		java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.name.compareTo(e2.name);
			}
		});
		for (int i = 0; i < employeeArray.length; i++) {
			System.out.println(employeeArray[i].name);
		}
		System.out.println("-------------------");
		/*
		 * - sort the Employee objects by their employee id
		 */
		java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.employeeId - o2.employeeId;
			}
		});
		for (int i = 0; i < employeeArray.length; i++) {
			System.out.println(employeeArray[i].employeeId + " : " + employeeArray[i].name);
		}
		System.out.println("-------------------");
		/*
		 * To compare the Employee objects in the array first by their name, and
		 * if that is the same, then by their employee id, the compare()
		 * implementation would look like this:
		 */
		java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				int nameDiff = e1.name.compareTo(e2.name);

				if (nameDiff != 0) {
					return nameDiff;
				}
				return e1.employeeId - e2.employeeId;
			}
		});
		for (int i = 0; i < employeeArray.length; i++) {
			System.out.println(employeeArray[i].employeeId + " : " + employeeArray[i].name);
		}
	}
}
