package com.arrays;

import java.util.Arrays;

public class SearchingArrays_Demo_10 {
	public static void main(String[] args) {
		/*
		 * java.lang.ClassCastException: com.arrays.Employee cannot be
		 * cast to java.lang.Comparable
		 * 
		 * because Employee not implementing Comparable interface
		 */
		/*Employee[] employeeArray = new Employee[3];

		employeeArray[0] = new Employee("Xander", 1);
		employeeArray[1] = new Employee("John", 3);
		employeeArray[2] = new Employee("Anna", 2);

		int index = Arrays.binarySearch(employeeArray, new Employee("Xander", 1));
		System.out.println("index = " + index);*/

		// Here Employee2 implements Comparable
		Employee2[] employeeArray2 = new Employee2[3];

		employeeArray2[0] = new Employee2("Xander", 1);
		employeeArray2[1] = new Employee2("John", 3);
		employeeArray2[2] = new Employee2("Anna", 2);

		int index2 = Arrays.binarySearch(employeeArray2, new Employee2("Xander", 1));
		System.out.println("index2 = " + index2);

	}
}
