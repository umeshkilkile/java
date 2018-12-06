package com.refactoringoldcode;

/*
  The template method design pattern is a common solution when you need to represent the
	outline of an algorithm and have the additional flexibility to change certain parts of it. Okay, it
	sounds a bit abstract. In other words, the template method pattern is useful when you find
	yourself in a situation such as “I’d love to use this algorithm but I need to change a few lines so it
	does what I want.”
 */
public class TemplateMethodDesignPatternWithoutLambda_Ex_5 {
	public static void main(String[] args) {

		OnlineBankingWithoutLambda banking = new OnlineBankingWithoutLambdaImpl();
		banking.processCustomer(1);

	}

}
