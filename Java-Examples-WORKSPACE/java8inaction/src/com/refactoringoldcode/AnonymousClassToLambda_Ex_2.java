package com.refactoringoldcode;

/*
 * - Converting anonymous classes to lambda expressions can be a difficult process in certain situations.
			- First, the meanings of this and super are different for anonymous classes and
				lambda expressions. Inside an anonymous class, this refers to the anonymous class itself, but
				inside a lambda it refers to the enclosing class.
			- Second, anonymous classes are allowed to shadow variables from the enclosing class. Lambda expressions can’t (they’ll cause a compile
				error)
 */
public class AnonymousClassToLambda_Ex_2 {
	public static void main(String[] args) {

		// Shadowing variable in Lambda expression gives compiler error
		int a = 10;
		Runnable r1 = () -> {
			//int a = 2;
			System.out.println(a);
		};
		r1.run();
		
		// Shadowing variable using Anonymous class
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				int a = 2;
				System.out.println(a);
			}
		};
		r2.run();
	}
}
