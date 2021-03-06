package com.currencyaddition_8;

public class CurrenyAddition_1 {
	public static void main(String[] args) {
		double a = 13.22;
		double b = 4.88;
		double c = 21.45;

		double abc = a + b + c;
		System.out.println("a + b + c = " + abc); // Outputs: a + b + c = 39.55

		// When we change the order, we also change the intermediate value that
		// is stored in the memory, and thus the result may differ.
		double acb = a + c + b;
		System.out.println("a + c + b = " + acb); // Outputs: a + c + b =
													// 39.550000000000004

		double ab = 18.1; // = 13.22 + 4.88
		double ac = 34.67; // = 13.22 + 21.45
		double sum_ab_c = ab + c;
		double sum_ac_b = ac + b;
		System.out.println("ab + c = " + sum_ab_c); // Outputs: 39.55
		System.out.println("ac + b = " + sum_ac_b); // Outputs:
													// 39.550000000000004

	}
}
