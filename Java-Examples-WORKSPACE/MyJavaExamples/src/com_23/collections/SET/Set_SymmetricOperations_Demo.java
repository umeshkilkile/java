package com_23.collections.SET;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Set_SymmetricOperations_Demo {
	public static void main(String... args) {

		String[] input = { "I", "Saw", "I", "Left" };
		String[] input2 = { "I", "Saw", "I", "Left", "I", "Quit" };

		Collection<String> s1 = Arrays.asList(input);
		Collection<String> s2 = Arrays.asList(input2);
		System.out.println("s1 = " + s1 + " s2 = " + s2);

		Set<String> symmetricDiff = new HashSet<String>(s1);
		System.out.println("symmetricDiff = " + symmetricDiff);

		symmetricDiff.addAll(s2);
		System.out.println("symmetricDiff.addAll(s2) = " + symmetricDiff);

		Set<String> tmp = new HashSet<String>(s1);
		System.out.println("tmp = " + tmp);

		tmp.retainAll(s2);
		System.out.println("tmp.retainAll(s2) = " + tmp);

		symmetricDiff.removeAll(tmp);
		System.out.println("symmetricDiff.removeAll(tmp) = " + symmetricDiff);
	}
}
