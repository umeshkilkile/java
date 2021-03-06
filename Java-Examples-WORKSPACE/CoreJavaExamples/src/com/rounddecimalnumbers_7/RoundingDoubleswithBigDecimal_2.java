package com.rounddecimalnumbers_7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingDoubleswithBigDecimal_2 {
	public static void main(String[] args) {
		double PI = 3.1415321;

		System.out.println("PI = " + PI);
		
		System.out.println("PI_2 = " + round(PI, 5));
	}

	private static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
