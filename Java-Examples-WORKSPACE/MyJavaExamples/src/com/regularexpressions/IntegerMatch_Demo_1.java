package com.regularexpressions;

public class IntegerMatch_Demo_1 {
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		/*
		 * this part of the string may be either a - or a + or nothing
		 * (because of the ?).
		 */
		System.out.println("+911".matches("(-|\\+)?\\d+"));
	}
}
/*
 * The first two expressions match, but the third one starts with a +, which
 * is a legitimate sign but means the number doesnt match the regular
 * expression. So we need a way to say, "may start with a + or a -." In regular
 * expressions, parentheses have the effect of grouping an expression, and the
 * vertical bar | means OR.
 */