package com_23.collections.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoSetsInstancesAreEqual_Demo {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("Umesh");
		set1.add("umesh");

		Set<String> set2 = new HashSet<>();
		set2.add("Umesh");
		set2.add("umesh");

		System.out.println(set1.containsAll(set2));
		System.out.println(set1 == set2);
		System.out.println(set1.equals(set2));

		Set<String> set3 = new LinkedHashSet<>();
		set3.add("Umesh");
		set3.add("umesh");
		System.out.println(set1.containsAll(set3));
	}

}
