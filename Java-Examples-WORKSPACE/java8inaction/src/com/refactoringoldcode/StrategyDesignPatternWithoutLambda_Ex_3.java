package com.refactoringoldcode;

public class StrategyDesignPatternWithoutLambda_Ex_3 {
	public static void main(String[] args) {
		Validator numericValidator = new Validator(new IsNumeric());
		boolean b1 = numericValidator.validate("aaaa");
		System.out.println("b1 = " + b1);

		Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
		boolean b2 = lowerCaseValidator.validate("bbbb");
		System.out.println("b2 = " + b2);
	}
}
