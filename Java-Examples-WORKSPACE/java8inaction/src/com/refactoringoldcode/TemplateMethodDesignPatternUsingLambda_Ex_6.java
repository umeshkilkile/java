package com.refactoringoldcode;

/*
  The template method design pattern is a common solution when you need to represent the
	outline of an algorithm and have the additional flexibility to change certain parts of it. Okay, it
	sounds a bit abstract. In other words, the template method pattern is useful when you find
	yourself in a situation such as “I’d love to use this algorithm but I need to change a few lines so it
	does what I want.”
 */
public class TemplateMethodDesignPatternUsingLambda_Ex_6 {
	public static void main(String[] args) {

		OnlineBankingUsingLambda banking = new OnlineBankingUsingLambdaImpl();
		banking.processCustomer(1337, (Customer c) -> System.out.println("Hello!"));

		/*
		 * You can now plug in different behaviors directly without subclassing
		 * the OnlineBanking class by passing lambda expressions:
		 */
		new OnlineBankingUsingLambdaImpl().processCustomer(1337,
				(Customer c) -> System.out.println("Hello " + c.getName()));

	}

}
