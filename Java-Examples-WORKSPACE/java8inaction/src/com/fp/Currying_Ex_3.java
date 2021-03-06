package com.fp;

import java.util.function.DoubleUnaryOperator;

public class Currying_Ex_3 {
	public static void main(String[] args) {
		DoubleUnaryOperator convertCtoF = curriedConverter(9.0 / 5, 32);
		DoubleUnaryOperator convertUSDtoGBP = curriedConverter(0.6, 0);
		DoubleUnaryOperator convertKmtoMi = curriedConverter(0.6214, 0);

		System.out.println("CtoF = " + convertCtoF.applyAsDouble(24));
		System.out.println("USDtoGBP = " + convertUSDtoGBP.applyAsDouble(100));
		System.out.println("KMtoML = " + convertKmtoMi.applyAsDouble(20));

		DoubleUnaryOperator convertFtoC = expandedCurriedConverter(-32, 5.0 / 9, 0);
		System.out.println("FtoC = " + convertFtoC.applyAsDouble(98.6));
	}

	static double converter(double x, double y, double z) {
		return x * y + z;
	}

	/*
	 * Instead of passing all the arguments x, f, and b all at once to the
	 * converter method, you only ask for the arguments f and b and return
	 * another function, which when given an argument x returns x * f + b. This
	 * enables you to reuse the conversion logic and create different functions
	 * with different conversion factors.
	 */
	static DoubleUnaryOperator curriedConverter(double y, double z) {
		return (double x) -> x * y + z;
	}

	static DoubleUnaryOperator expandedCurriedConverter(double w, double y, double z) {
		return (double x) -> (x + w) * y + z;
	}
}

/*
 * What is Currying?
 * 
 * - Currying is a technique where a function f of two arguments (x and y, say)
 * is seen instead as a function g of one argument that returns a function also
 * of one argument.
 * 
 * - The value returned by the latter function is the same as the value of the
 * original function, that is, f(x,y) = (g(x))(y).
 * 
 * - Of course, this generalizes: you can curry a six-argument function to first
 * take arguments numbered 2, 4, and 6 returning a function taking argument 5,
 * which returns a function taking the remaining arguments, 1 and 3.
 * 
 * - When some but fewer than the full complement of arguments have been passed,
 * we often say the function is partially applied.
 * 
 * - In mathematics and computer science, currying is the technique of
 * translating the evaluation of a function that takes multiple arguments (or a
 * tuple of arguments) into evaluating a sequence of functions, each with a
 * single argument. Currying is related to, but not the same as, partial
 * application.
 */