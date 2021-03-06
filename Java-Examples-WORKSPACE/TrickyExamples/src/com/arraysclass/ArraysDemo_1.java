package com.arraysclass;

import java.util.Arrays;

public class ArraysDemo_1 {
	public static void main(String[] args) {
		int nums[] = new int[] { 10, 23, 45, 78, 93, 16 };
		/*
		 * - Sorts the specified array into ascending numerical order.
		 * 
		 * - Arrays.sort uses the Dual-Pivot Quicksort algorithm by Vladimir
		 * Yaroslavskiy, Jon Bentley, and Josh Bloch. The algorithm offers O(n
		 * log(n)) performance on many data sets that cause other quicksorts to
		 * degrade to quadratic performance, and is typically faster than
		 * traditional (one-pivot) Quicksort implementations.
		 */
		Arrays.sort(nums);
		for (int n : nums) {
			System.out.println(n);
		}
		System.out.println("------------------");
		/*
		 * Uses Mergesort
		 */
		String names[] = new String[] { "Umesh", "Ananya", "Sharada", "Subhash", "Narmada" };
		Arrays.sort(names);
		for (String s : names) {
			System.out.println(s);
		}

		System.out.println("------------------");

		Employee emp1 = new Employee(1000, "Umesh", 1000);
		Employee emp2 = new Employee(1001, "Satheesh", 2000);
		Employee emp3 = new Employee(1004, "Srivatsa", 4000);
		Employee emp4 = new Employee(1003, "Avinash", 3000);
		Employee emp5 = new Employee(1002, "Shadyab", 12000);

		Employee empArr1[] = new Employee[] { emp1, emp2, emp3, emp4, emp5 };
		/*
		 * ClassCastException if the array contains elements that are not
		 * mutually comparable.
		 * 
		 * Below Arrays.sort(emp); will throws,
		 * 
		 * Exception in thread "main" java.lang.ClassCastException:
		 * com.arraysclass.Employee cannot be cast to java.lang.Comparable
		 */
		// Arrays.sort(empArr1);
		for (Employee e : empArr1) {
			System.out.println(e);
		}

		System.out.println("------------------");

		Employee2 emp6 = new Employee2(1000, "Umesh", "Kilkile", 1000);
		Employee2 emp7 = new Employee2(1001, "Satheesh", "Sirohi", 2000);
		Employee2 emp8 = new Employee2(1004, "Srivasa", "Sharma", 4000);
		Employee2 emp9 = new Employee2(1003, "Avinash", "Yadav", 3000);
		Employee2 emp10 = new Employee2(1002, "Shadyab", "Akhtar", 12000);

		Employee2 empArr2[] = new Employee2[] { emp6, emp7, emp8, emp9, emp10 };
		Arrays.sort(empArr2);
		for (Employee2 e : empArr2) {
			System.out.println(e);
		}

		System.out.println("------------------Based on Salary");

		Employee2 emp11 = new Employee2(1000, "Umesh", "Kilkile", 1000);
		Employee2 emp12 = new Employee2(1001, "Satheesh", "Sirohi", 2000);
		Employee2 emp13 = new Employee2(1004, "Srivasa", "Sharma", 4000);

		Employee2 empArr3[] = new Employee2[] { emp12, emp13, emp11 };
		Arrays.sort(empArr3, new Employee2SalComparatorImpl());

		for (Employee2 e : empArr3) {
			System.out.println(e);
		}
	}
}
