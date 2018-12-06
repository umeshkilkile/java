package Item27;

import java.util.HashSet;
import java.util.Set;

public class GenericMethod {
	public static void main(String[] args) {
		// String
		Set<String> set1 = new HashSet<String>();
		set1.add("Umesh");
		set1.add("Kilkile");

		Set<String> set2 = new HashSet<String>();
		set2.add("Mahesh");
		set2.add("Sakhare");

		Set<String> unionSet = union(set1, set2);
		System.out.println(unionSet);

		// Integers
		Set<Integer> set3 = new HashSet<Integer>();
		set3.add(100);
		set3.add(200);

		Set<Integer> set4 = new HashSet<Integer>();
		set4.add(300);
		set4.add(400);

		Set<Integer> unionSet2 = union(set3, set3);
		System.out.println(unionSet2);
	}

	// Generic method
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<E>(s1);
		result.addAll(s2);
		return result;
	}
}
