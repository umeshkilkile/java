package com_6.operators;

/*
 * NOTE : The code result++; and ++result; will both end in result being incremented by one. 
 * The only difference is that the prefix version (++result) evaluates to the incremented value, 
 * whereas the postfix version (result++) evaluates to the original value.
 */
public class IncrementDecrementPrePostOperators_DEMO_3 {
	public static void main(String[] args) {
		int i = 3;
		i++;

		// prints 4
		System.out.println(i);

		++i;
		// prints 5
		System.out.println(i);

		// prints 6
		System.out.println(++i);

		// prints 6
		System.out.println(i++);

		// prints 7
		System.out.println(i);
	}
}
