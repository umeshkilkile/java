package com_23.collections.SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SET_OperationsOnSets_Demo {
	public static void main(String[] args) {
		
		Employee str[] = { new Employee("Umesh", "Kilkile"), new Employee("Sanyog", "Gupta"), new Employee("Jagdish", "Chandran") , new Employee("Priyanka", "Chopra")};
		Employee str2[] = { new Employee("Umesh", "Kilkile"), new Employee("Sanyog", "Gupta"), new Employee("Jagdish", "Chandran"),new Employee("Ileana", "Dcruz")};
		

		List<Employee> str3 = Arrays.asList(str);
		List<Employee> str4 = Arrays.asList(str2);

		System.out.println("SET-1 : " + str3);
		System.out.println("SET-2 : " + str4);

		System.out.println("\nHashSet Implementation\n");
		/*
		 * UNION : (HashSet)
		 */
		Set<Employee> union = new HashSet<Employee>(str3);
		union.addAll(str4);
		System.out.println("UNION (HashSet): " + union);
		
		/*
		 * INTERSECTION : (HashSet)
		 */
		Set<Employee> intersection = new HashSet<Employee>(str3);
		intersection.retainAll(str4);
		System.out.println("INTERSECTION (HashSet): " + intersection);
		
		/*
		 * DIFFERENCE : (HashSet)
		 */
		Set<Employee> difference = new HashSet<Employee>(str3);
		difference.removeAll(str4);
		System.out.println("DIFFERENCE (HashSet): " + difference);
		
		System.out.println("\nTreeSet Implementation\n");
		
		/*
		 * UNION : (TreeSet)
		 */
		Set<Employee> union2 = new TreeSet<Employee>(str3);
		union2.addAll(str4);
		System.out.println("UNION (TreeSet): " + union2);
		
		/*
		 * INTERSECTION : (TreeSet)
		 */
		Set<Employee> intersection2 = new TreeSet<Employee>(str3);
		intersection2.retainAll(str4);
		System.out.println("INTERSECTION (TreeSet): " + intersection2);
		
		/*
		 * DIFFERENCE : (TreeSet)
		 */
		Set<Employee> difference2 = new TreeSet<Employee>(str3);
		difference2.removeAll(str4);
		System.out.println("DIFFERENCE (TreeSet): " + difference2);

		
		
		System.out.println("\nLinkedHashSet Implementation\n");
		
		/*
		 * UNION : (LinkedHashSet)
		 */
		Set<Employee> union3 = new LinkedHashSet<Employee>(str3);
		union3.addAll(str4);
		System.out.println("UNION (LinkedHashSet): " + union3);
		
		/*
		 * INTERSECTION : (LinkedHashSet)
		 */
		Set<Employee> intersection3 = new LinkedHashSet<Employee>(str3);
		intersection3.retainAll(str4);
		System.out.println("INTERSECTION (LinkedHashSet): " + intersection3);
		
		/*
		 * DIFFERENCE : (LinkedHashSet)
		 */
		Set<Employee> difference3 = new LinkedHashSet<Employee>(str3);
		difference3.removeAll(str4);
		System.out.println("DIFFERENCE (LinkedHashSet): " + difference3);

	}
}
