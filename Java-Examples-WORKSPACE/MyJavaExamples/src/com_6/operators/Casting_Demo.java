package com_6.operators;

public class Casting_Demo {
	public static void main(String[] args) {
		int i = 200;
		long lng = (long) i;
		System.out.println("lng = " + lng);
		lng = i; // "Widening," so cast not really required
		long lng2 = (long) 200;
		System.out.println("lng2 = " + lng2);
		lng2 = 200;
		// A "narrowing conversion":
		i = (int) lng2; // Cast required
		System.out.println(i);
	}
}
