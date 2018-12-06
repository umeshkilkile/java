package com_6.operators;

/*
 * But while the contents of the objects are the same, the references are not the same.
 */
public class Equivalence_Demo {
	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println("n1 == n2 -> " + (n1 == n2));
		System.out.println("n1 != n2 -> " + (n1 != n2));

		/*
		 * What if you want to compare the actual contents of an object for
		 * equivalence? You must use the special method equals( ) that exists
		 * for all objects (not primitives, which work fine with == and !=).
		 * Here’s how it’s used:
		 */
		System.out.println("n1.equals(n2) -> " + n1.equals(n2));
		System.out.println("-------------------------");
		n2 = n1;
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1.equals(n2));
	}
}
