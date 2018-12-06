package com.comp;

public class Demo_1 {
	public static void main(String[] args) {

		/*
		 * Prior to Java 8, you'd write code that looks like this
		 */
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Before Java 8, Hi");
			}
		};

		new Thread(runnable).start();

		/*
		 * In Java 8, you'd write code that looks like this to sort
		 */
		new Thread(() -> System.out.println("In Java 8, Hi")).start();
	}
}

/*
 * The important point here is that lambda expressions let you create an
 * instance of a functional interface. The body of the lambda expression
 * provides the implementation for the single abstract method of the functional
 * interface. As a result, the following uses of Runnable via anonymous classes
 * and lambda expressions will produce the same output:
 * 
 */
