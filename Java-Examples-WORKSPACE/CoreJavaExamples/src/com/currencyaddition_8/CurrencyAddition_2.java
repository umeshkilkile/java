package com.currencyaddition_8;

import java.math.BigDecimal;

public class CurrencyAddition_2 {
	public static void main(String[] args) {
		double a = 13.22;
		double b = 4.88;
		double c = 21.45;

		BigDecimal d = new BigDecimal(String.valueOf(a));
		BigDecimal e = new BigDecimal(String.valueOf(b));
		BigDecimal f = new BigDecimal(String.valueOf(c));

		BigDecimal def = d.add(e).add(f);
		BigDecimal dfe = d.add(f).add(e);

		System.out.println("d + e + f = " + def); // Outputs: 39.55
		System.out.println("d + f + e = " + dfe); // Outputs: 39.55
	}
}

/*
 * Because of notorious inaccuracy of floating point numbers, double should
 * never be used for precise values. This includes currency. For accurate
 * values, we can use BigDecimal class:
 */