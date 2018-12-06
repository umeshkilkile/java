package com_6.operators;

public class ShortCircuit_Demo {
	static boolean test1(int val) {
		System.out.println("test1(" + val + ")");
		System.out.println("result: " + (val < 1));
		return val < 1;
	}

	static boolean test2(int val) {
		System.out.println("test2(" + val + ")");
		System.out.println("result: " + (val < 2));
		return val < 2;
	}

	static boolean test3(int val) {
		System.out.println("test3(" + val + ")");
		System.out.println("result: " + (val < 3));
		return val < 3;
	}

	public static void main(String[] args) {
		/*
		 * - Each test performs a comparison against the argument and returns
		 * true or false. It also prints information to show you that it’s being
		 * called.
		 * 
		 * - You might naturally think that all three tests would be executed,
		 * but the output shows otherwise. The first test produced a true
		 * result, so the expression evaluation continues. However, the second
		 * test produced a false result. Since this means that the whole
		 * expression must be false, why continue evaluating the rest of the
		 * expression? It might be expensive. The reason for shortcircuiting, in
		 * fact, is that you can get a potential performance increase if all the
		 * parts of a logical expression do not need to be evaluated.
		 */
		boolean b = test1(0) && test2(2) && test3(2);
		System.out.println("expression is " + b);
	}
}
