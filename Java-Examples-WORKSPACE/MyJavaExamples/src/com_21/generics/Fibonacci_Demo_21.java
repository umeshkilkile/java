package com_21.generics;

public class Fibonacci_Demo_21 implements Generator<Integer> {
	private int count = 0;

	public Integer next() {
		return fib(count++);
	}

	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

	public static void main(String[] args) {
		Fibonacci_Demo_21 gen = new Fibonacci_Demo_21();
		for (int i = 0; i < 20; i++)
			System.out.print(gen.next() + " ");
	}

}
