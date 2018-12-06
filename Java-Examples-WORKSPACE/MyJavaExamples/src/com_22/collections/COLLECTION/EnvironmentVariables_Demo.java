package com_22.collections.COLLECTION;

import java.util.Map;

public class EnvironmentVariables_Demo {
	public static void main(String[] args) {
		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
/*
 * - In Java SE5, a number of classes have been made Iterable, primarily all
 * Collection classes (but not Maps).
 * 
 * - System.getenv( )7 returns a Map, entrySet( ) produces a Set of Map.Entry
 * elements, and a Set is Iterable so it can be used in a foreach loop.
 */