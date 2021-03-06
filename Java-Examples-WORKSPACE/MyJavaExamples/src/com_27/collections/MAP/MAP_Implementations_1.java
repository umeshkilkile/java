package com_27.collections.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAP_Implementations_1 {
	public static void main(String[] args) {
		
		/*
		 * Snippet-1 : HashMap
		 */
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		String sentence = "if it is to be it is up to me to delegate";
		String[] values = sentence.split(" ");
		// Initialize frequency table from command line
		for (String a : values) {
			Integer freq = hashMap.get(a);
			hashMap.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(hashMap.size() + " distinct words:");
		System.out.println(hashMap);
		
		/*
		 * Snippet-2 : TreeMap
		 */
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();

		// Initialize frequency table from command line
		for (String a : values) {
			Integer freq = treeMap.get(a);
			treeMap.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(treeMap.size() + " distinct words:");
		System.out.println(treeMap);

		/*
		 * Snippet-2 : LinkedHashMap
		 */
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();

		// Initialize frequency table from command line
		for (String a : values) {
			Integer freq = linkedHashMap.get(a);
			linkedHashMap.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(linkedHashMap.size() + " distinct words:");
		System.out.println(linkedHashMap);

	}
	
}
