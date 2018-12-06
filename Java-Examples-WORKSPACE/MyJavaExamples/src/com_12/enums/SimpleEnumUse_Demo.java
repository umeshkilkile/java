package com_12.enums;

public class SimpleEnumUse_Demo {
	public static void main(String[] args) {
		Spiciness howHot = Spiciness.MEDIUM;
		System.out.println(howHot);

		for (Spiciness s : Spiciness.values())
			System.out.println(s + ", ordinal " + s.ordinal());
	}
}

/*
 * - Although enums appear to be a new data type, the keyword only produces some
 * compiler behavior while generating a class for the enum, so in many ways you
 * can treat an enum as if it were any other class. In fact, enums are classes
 * and have their own methods.
 */