package com_23.collections.SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SET_OperationsOnSets_Demo2 {
	public static void main(String[] args) {

		String str[] = { "India", "France", "England", "Denmark", "Finland", "Russia", "India", "Canada" };
		String str2[] = { "India", "France", "England", "Denmark", "Finland", "Russia", "India", "USA" };

		List<String> str3 = Arrays.asList(str);
		List<String> str4 = Arrays.asList(str2);

		System.out.println("SET-1 : " + str3);
		System.out.println("SET-2 : " + str4);

		System.out.println("\nHashSet Implementation\n");
		/*
		 * UNION : (HashSet)
		 */
		Set<String> union = new HashSet<String>(str3);
		union.addAll(str4);
		System.out.println("UNION (HashSet): " + union);

		/*
		 * INTERSECTION : (HashSet)
		 */
		Set<String> intersection = new HashSet<String>(str3);
		intersection.retainAll(str4);
		System.out.println("INTERSECTION (HashSet): " + intersection);

		/*
		 * DIFFERENCE : (HashSet)
		 */
		Set<String> difference = new HashSet<String>(str3);
		difference.removeAll(str4);
		System.out.println("DIFFERENCE (HashSet): " + difference);

		System.out.println("\nTreeSet Implementation\n");

		/*
		 * UNION : (TreeSet)
		 */
		Set<String> union2 = new TreeSet<String>(str3);
		union2.addAll(str4);
		System.out.println("UNION (TreeSet): " + union2);

		/*
		 * INTERSECTION : (TreeSet)
		 */
		Set<String> intersection2 = new TreeSet<String>(str3);
		intersection2.retainAll(str4);
		System.out.println("INTERSECTION (TreeSet): " + intersection2);

		/*
		 * DIFFERENCE : (TreeSet)
		 */
		Set<String> difference2 = new TreeSet<String>(str3);
		difference2.removeAll(str4);
		System.out.println("DIFFERENCE (TreeSet): " + difference2);

		System.out.println("\nLinkedHashSet Implementation\n");

		/*
		 * UNION : (LinkedHashSet)
		 */
		Set<String> union3 = new LinkedHashSet<String>(str3);
		union3.addAll(str4);
		System.out.println("UNION (LinkedHashSet): " + union3);

		/*
		 * INTERSECTION : (LinkedHashSet)
		 */
		Set<String> intersection3 = new LinkedHashSet<String>(str3);
		intersection3.retainAll(str4);
		System.out.println("INTERSECTION (LinkedHashSet): " + intersection3);

		/*
		 * DIFFERENCE : (LinkedHashSet)
		 */
		Set<String> difference3 = new LinkedHashSet<String>(str3);
		difference3.removeAll(str4);
		System.out.println("DIFFERENCE (LinkedHashSet): " + difference3);
	}
}
