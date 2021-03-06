package com_27.collections.MAP;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MAP_Multimaps_8 {
	public static void main(String[] args) {
		int minGroupSize = Integer.parseInt("8");

		// Read words from file and put into a simulated multimap
		Map<String, List<String>> m = new HashMap<String, List<String>>();

		String fileName = "C://UMESH SUBHASH KILKILE//MY_TEST_EXAMPLES_WORKSPACE//MY_JAVA_JEE_STUDY_WORKSPACE//Java-Oracle-Examples-WORKSPACE//MyJavaOracleExamples//src//com_27//collections//MAP//dictionary.txt";
		try {
			Scanner s = new Scanner(new File(fileName));
			while (s.hasNext()) {
				String word = s.next();
				String alpha = alphabetize(word);
				List<String> l = m.get(alpha);
				if (l == null)
					m.put(alpha, l = new ArrayList<String>());
				l.add(word);
			}
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}

		// Print all permutation groups above size threshold
		for (List<String> l : m.values())
			if (l.size() >= minGroupSize)
				System.out.println(l.size() + ": " + l);
	}

	private static String alphabetize(String s) {
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
}
