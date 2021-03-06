package com_23.collections.SET;

import java.util.HashSet;
import java.util.Set;

public class SET_FindDups_Demo {
	public static void main(String[] args) {

		String str[] = { "I", "Came", "I", "Saw", "I", "Left" };

		Set<String> s = new HashSet<String>();
		for (String a : str) {
			s.add(a);
		}

		System.out.println(s.size() + " distinct words: " + s);
	}
}
