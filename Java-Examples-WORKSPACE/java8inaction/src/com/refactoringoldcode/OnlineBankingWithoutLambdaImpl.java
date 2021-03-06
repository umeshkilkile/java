package com.refactoringoldcode;

/*
 * Different branches can now provide different implementations of the method makeCustomerHappy by subclassing 
 * the OnlineBanking class.
 */
public class OnlineBankingWithoutLambdaImpl extends OnlineBankingWithoutLambda {

	@Override
	void makeCustomerHappy(Customer c) {
		System.out.println("C = " + c);
	}

}
