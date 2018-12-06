package com_19.string;

public class StringBuilder_DEMO_4 {
	public static void main(String[] args) {
		String palindrome = "Dot saw I was Tod";
		StringBuilder sb = new StringBuilder(palindrome);
		sb.reverse(); // reverse it
		System.out.println(sb);
	}
}
