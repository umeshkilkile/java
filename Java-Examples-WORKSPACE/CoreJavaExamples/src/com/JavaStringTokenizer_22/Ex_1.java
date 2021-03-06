package com.JavaStringTokenizer_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Ex_1 {
	public static void main(String[] args) {
		String s = "Ume,Sharad,Anaya";

		List<String> l = getTokens(s);
		System.out.println(l);

		List<String> l2 = getTokensWithCollection(s);
		System.out.println(l2);
	}

	public static List<String> getTokens(String str) {
		List<String> tokens = new ArrayList<>();
		StringTokenizer tokenizer = new StringTokenizer(str, ",");
		while (tokenizer.hasMoreElements()) {
			String s1 = tokenizer.nextToken();
			System.out.println(s1);
			tokens.add(s1);
		}
		return tokens;
	}

	// Java 8 approach
	public static List<String> getTokensWithCollection(String str) {
		return Collections.list(new StringTokenizer(str, ",")).stream().map(token -> (String) token)
				.collect(Collectors.toList());
	}
}
