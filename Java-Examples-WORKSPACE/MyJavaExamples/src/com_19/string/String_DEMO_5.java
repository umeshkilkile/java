package com_19.string;

public class String_DEMO_5 {
	public static void main(String[] args) {
		String s1 = "Umesh";
		String s2 = new String("Umesh");

		if (s1 == s2) {
			System.out.println("s1 == s2 : " + (s1 == s2));
		}

		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2) : " + (s1.equals(s2)));
		}
	}
}
