package com_22.collections.COLLECTION;

import java.util.Arrays;

public class AdapterMethodIdiom_Demo {
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<String>(
				Arrays.asList("To be or not to be".split(" ")));
		// Grabs the ordinary iterator via iterator():
		for (String s : ral)
			System.out.print(s + " ");
		System.out.println();
		// Hand it the Iterable of your choice
		for (String s : ral.reversed())
			System.out.print(s + " ");
	}
}
