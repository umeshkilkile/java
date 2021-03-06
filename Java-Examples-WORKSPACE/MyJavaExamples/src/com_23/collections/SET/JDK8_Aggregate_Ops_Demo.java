package com_23.collections.SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Pass duplicate string args in command prompt
 */
public class JDK8_Aggregate_Ops_Demo {
	public static void main(String[] args) {
		/*
		 * Using JDK 8 aggregate operations.
		 */
		Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
		System.out.println(distinctWords.size() + " distinct words: " + distinctWords);

		/*
		 * Using for-each construct
		 */
		Set<String> s = new HashSet<String>();
		for (String a : args)
			s.add(a);
		System.out.println(s.size() + " distinct words: " + s);
	}
}
