package com_6.operators;

public class ConditionalOperators_DEMO_5 {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		if ((value1 == 1) && (value2 == 2))
			System.out.println("value1 is 1 AND value2 is 2");
		
		if ((value1 == 1) || (value2 == 1))
			System.out.println("value1 is 1 OR value2 is 1");
		
		System.out.println("Conditional OR behavior");
		
		System.out.println("false || false -> " + (false || false));
		System.out.println("false || true -> " + (false || true));
		System.out.println("true || false -> " + (true || false)); //If you notice this warning it means - These operators exhibit "short-circuiting" behavior, which means that the second operand is evaluated only if needed.
		System.out.println("true || true -> " + (true || true));
		
		System.out.println("\nConditional AND behavior");
		System.out.println("false && false -> " + (false && false));
		System.out.println("false && true -> " + (false && true));
		System.out.println("true && false -> " + (true && false));
		System.out.println("true && true -> " + (true && true));
	}
}

/* OR Operation
0 0 - 0 -> false false - false
0 1 - 1 -> false true  - true
1 0 - 1 -> true false  - true
1 1 - 1 -> true true   - true

AND Operation
0 0 - 0 -> false false - false
0 1 - 0 -> false true  - false
1 0 - 0 -> true false  - false
1 1 - 1 -> true true   - true
*/