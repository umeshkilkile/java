package com.lambdasinaction;

public class LambdaExpressions_Ex6 {
	public static void main(String[] args) {
		// Using Lambda
		Runnable r1 = () -> System.out.println("Hello World!");

		// Using anonymous inner class
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World - 2");
			}
		};

		process(r1);
		process(r2);
		// With Lambda passed directly
		process(() -> System.out.println("Hello World - 3"));

		// A valid Lambda expression because run won't take any parameters and
		// won't return any value.
		process(() -> {
		});
	}

	public static void process(Runnable r) {
		r.run();
	}
}
