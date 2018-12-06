package com.refactoringoldcode;

import java.util.function.Supplier;

public class FactoryPatternUsingLambda_Ex_12 {
	public static void main(String[] args) {
		Supplier<Product> loanSupplier = Loan::new;
		Product p2 = loanSupplier.get();

		Product p3 = ProductFactory.createProductLambda("bond");
	}
}
