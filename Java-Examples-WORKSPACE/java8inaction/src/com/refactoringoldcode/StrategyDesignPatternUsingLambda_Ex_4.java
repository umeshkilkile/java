package com.refactoringoldcode;

/*
 * ValidationStrategy is a functional interface (in addition, it has
the same function descriptor as Predicate<String>). This means that instead of declaring new
classes to implement different strategies, you can pass lambda expressions directly, which are
more concise:
 */
public class StrategyDesignPatternUsingLambda_Ex_4 {
	public static void main(String[] args) {
		// Passing lambda directly
		Validator lowerCaseValidator = new Validator((String s) -> s.matches("[a-z]+"));
		boolean b1 = lowerCaseValidator.validate("aaaa");
		System.out.println("b1 = " + b1);

		// Passing lambda directly
		Validator numericValidator = new Validator((String s) -> s.matches("\\d+"));
		boolean b2 = numericValidator.validate("bbbb");
		System.out.println("b2 = " + b2);
	}
}
