package com_27.collections.MAP;

import java.util.HashMap;
import java.util.Map;

public class MAP_Basic_Ops_7 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();

		// Initialize frequency table from command line
		for (String a : args) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(m.size() + " distinct words:");
		System.out.println(m);
	}
}

/*
 * Pass these values as command line parameters.
 * 
 * if it is to be it is up to me to delegate
 */
