package com_23.collections.SET;

import java.util.HashSet;
import java.util.Set;

public class SET_Implementations_HashSet_Demo {
	public static void main(String[] args) {
		/*
		 * HashSet : HashSet, which stores its elements in a hash table, is the
		 * best-performing implementation; however it makes no guarantees
		 * concerning the order of iteration
		 */
		Set<Employee> set = new HashSet<Employee>();

		Employee emp1 = new Employee("Umesh", "Kilkile");
		Employee emp2 = new Employee("Anand", "Navale");
		boolean isAdded1 = set.add(emp1);
		boolean isAdded2 = set.add(emp2);

		Employee emp3 = new Employee("Umesh", "Kilkile");
		boolean isAdded3 = set.add(emp3);

		System.out.println(isAdded1 + " : " + isAdded2 + " : " + isAdded3);

		System.out.println("Elements in set : " + set.size());

		System.out.println(emp1.hashCode() + " : " + emp2.hashCode() + " : " + emp3.hashCode());

		System.out.println("emp1 == emp3 : " + (emp1 == emp3));
		System.out.println("emp1.equals(emp3) : " + (emp1.equals(emp3)));

		System.out.println("emp1 == emp2 : " + (emp1 == emp2));
		System.out.println("emp1.equals(emp2) : " + (emp1.equals(emp2)));
	}
}
