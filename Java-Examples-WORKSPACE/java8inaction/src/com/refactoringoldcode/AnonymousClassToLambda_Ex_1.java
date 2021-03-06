package com.refactoringoldcode;

/*
 * The first simple refactoring you should consider is converting uses of anonymous classes 
 * implementing one single abstract method to lambda expressions
 */
public class AnonymousClassToLambda_Ex_1 {
	public static void main(String[] args) {
		/*
		 * Using an anonymous class
		 */
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		r1.run();

		/*
		 * Using Lambda expression
		 */
		Runnable r2 = () -> System.out.println("Hello 2");
		r2.run();
	}
}
