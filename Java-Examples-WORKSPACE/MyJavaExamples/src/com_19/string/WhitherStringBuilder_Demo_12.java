package com_19.string;

public class WhitherStringBuilder_Demo_12 {
	public String implicit(String[] fields) {
		String result = "";
		for (int i = 0; i < fields.length; i++)
			result += fields[i];
		return result;
	}

	public String explicit(String[] fields) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < fields.length; i++)
			result.append(fields[i]);
		return result.toString();
	}

	public static void main(String[] args) {
		WhitherStringBuilder_Demo_12 demo_12 = new WhitherStringBuilder_Demo_12();
		String a[] = { "An", "Apple", "A", "Day" };
		String s = demo_12.implicit(a);
		System.out.println(s);

		String s1 = demo_12.explicit(a);
		System.out.println(s1);
	}
}
