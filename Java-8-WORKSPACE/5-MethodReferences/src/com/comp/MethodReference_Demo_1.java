/**
 * 
 */
package com.comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ukilkil
 *
 */
public class MethodReference_Demo_1 {
	public static void main(String[] args) {
		List<String> strs = Arrays.asList("C","a","A","b");
		System.out.println("Before sort : " + strs);
		
		/*
		 * Prior to Java 8, you'd write code that looks like this
		 */
		Collections.sort(strs, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});
		System.out.println("After sort : " + strs);
		
		/*
		 * In Java 8, you'd write code that looks like this to sort
		 */
		Collections.sort(strs, String::compareToIgnoreCase);
		System.out.println("After sort in Java 8 : " + strs);
	}
}
