package com_6.operators;
/*
 The Unary Operators
 
	+       Unary plus operator; indicates positive value (numbers are positive without this, however)
	-       Unary minus operator; negates an expression
	++      Increment operator; increments a value by 1
	--      Decrement operator; decrements a value by 1
	!       Logical complement operator; inverts the value of a boolean
 
 */
public class UnaryOperators_DEMO_2 {
	public static void main(String[] args) {
		// result is now 1
		int result = +1;
		System.out.println(result);
		
		// result is now 0
		result--;
		System.out.println(result);
		
		// result is now 1
		result++;
		System.out.println(result);
		
		// result is now -1
		result = -result;
		System.out.println(result);
		
		boolean success = false;
		// false
		System.out.println(success);
		// true
		System.out.println(!success);
	}
}
