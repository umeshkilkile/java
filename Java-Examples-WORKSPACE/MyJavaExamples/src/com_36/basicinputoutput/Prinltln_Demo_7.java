package com_36.basicinputoutput;

/*
 * Invoking print or println outputs a single value after converting the value using the appropriate toString method.
 */
public class Prinltln_Demo_7 {
	public static void main(String[] args) {
		int i = 2;
		double r = Math.sqrt(i);

		System.out.print("The square root of ");
		System.out.print(i);
		System.out.print(" is ");
		System.out.print(r);
		System.out.println(".");

		i = 5;
		r = Math.sqrt(i);
		System.out.println("The square root of " + i + " is " + r + ".");
	}
}
