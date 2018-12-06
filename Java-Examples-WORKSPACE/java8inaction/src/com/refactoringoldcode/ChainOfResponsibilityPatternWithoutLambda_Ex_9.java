package com.refactoringoldcode;

public class ChainOfResponsibilityPatternWithoutLambda_Ex_9 {
	public static void main(String[] args) {
		ProcessingObject<String> p1 = new HeaderTextProcessing();
		ProcessingObject<String> p2 = new SpellCheckerProcessing();
		// Chaining two processing objects
		p1.setSuccessor(p2);
		String result1 = p1.handle("Aren't labdas really sexy?!!");
		System.out.println(result1);
	}
}
