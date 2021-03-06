package com.refactoringoldcode;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChainOfResponsibilityPatternUsingLambda_Ex_10 {
	public static void main(String[] args) {
		// The first processing object
		UnaryOperator<String> headerProcessing = (String text) -> "From Raoul, Mario and Alan: " + text;

		// The second processing object
		UnaryOperator<String> spellCheckerProcessing = (String text) -> text.replaceAll("labda", "lambda");

		// Compose the two functions, resulting in a chain of operations
		Function<String, String> pipeline = headerProcessing.andThen(spellCheckerProcessing);
		String result2 = pipeline.apply("Aren't labdas really sexy?!!");
		System.out.println(result2);
	}
}
