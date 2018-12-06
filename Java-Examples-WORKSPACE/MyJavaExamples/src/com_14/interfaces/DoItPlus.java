package com_14.interfaces;

public interface DoItPlus extends DoIt {
	boolean didItWork(int i, int x, String s);

	default boolean didItWorkedDefault(int i, int x, String s) {
		int sum = i + x;
		return sum > 10 && s.equalsIgnoreCase("Yes");
	}
}
