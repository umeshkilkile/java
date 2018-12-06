package com_21.generics;

public class GenericMethod_Demo_4 {
	public static void main(String[] args) {
		/*
		 * Syntax - 1 for invoking generic methods
		 */
		Pair_2<Integer, String> p1 = new Pair_2<>(1, "apple");
		Pair_2<Integer, String> p2 = new Pair_2<>(2, "pear");
		boolean same = Util.<Integer, String> compare(p1, p2);
		System.out.println("p1 and p2 Same? " + same);

		/*
		 * Syntax - 2 for invoking generic methods
		 */
		Pair_2<Integer, String> p3 = new Pair_2<>(1, "apple");
		Pair_2<Integer, String> p4 = new Pair_2<>(1, "apple");
		boolean same1 = Util.compare(p3, p4);
		System.out.println("p3 and p4 Same? " + same1);
		
		
		Pair_2<String, String> p5 = new Pair_2<>("IBM", "California");
		Pair_2<String, String> p6 = new Pair_2<>("IBM", "California");
		boolean same2 = Util.compare(p5, p6);
		System.out.println("p3 and p4 Same? " + same2);
	}
}
