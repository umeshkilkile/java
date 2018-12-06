package com_6.operators;

/*
 The Equality and Relational Operators

	==      equal to
	!=      not equal to
	>       greater than
	>=      greater than or equal to
	<       less than
	<=      less than or equal to

 */
public class EqualityAndRelationalOperators_DEMO_4 {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		if (value1 == value2)
			System.out.println("value1 == value2");
		
		if (value1 != value2)
			System.out.println("value1 != value2");
		
		if (value1 > value2)
			System.out.println("value1 > value2");
		
		if (value1 < value2)
			System.out.println("value1 < value2");
		
		if (value1 <= value2)
			System.out.println("value1 <= value2");
	}
}
