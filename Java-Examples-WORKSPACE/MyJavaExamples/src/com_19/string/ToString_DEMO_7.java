package com_19.string;

public class ToString_DEMO_7 {
	public static void main(String[] args) {
		/*
		 * Converting Numbers to Strings
		 */
		double d = 858.48;
		String s = Double.toString(d);

		int dot = s.indexOf('.');

		System.out.println(dot + " digits " + "before decimal point.");
		System.out.println((s.length() - dot - 1) + " digits after decimal point.");
	}
}
