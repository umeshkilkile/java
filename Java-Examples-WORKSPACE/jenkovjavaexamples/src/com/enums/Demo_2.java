package com.enums;

public class Demo_2 {
	public static void main(String[] args) {
		// Enum Iteration
		/*
		 * You can obtain an array of all the possible values of a Java enum
		 * type by calling its static values() method. All enum types get a
		 * static values() method automatically by the Java compiler. Here is an
		 * example of iterating all values of an enum:
		 */
		for (Level level : Level.values()) {
			System.out.println(level);
		}
	}
}
