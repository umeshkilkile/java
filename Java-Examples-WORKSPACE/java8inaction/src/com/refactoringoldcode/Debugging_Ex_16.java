package com.refactoringoldcode;

import java.util.Arrays;
import java.util.List;

public class Debugging_Ex_16 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		numbers.stream().map(Debugging_Ex_16::divideByZero).forEach(System.out::println);
	}

	public static int divideByZero(int n) {
		return n / 0;
	}
}

/*
 * - Note that if a method reference refers to a method declared in the same
 * class as where it’s used, then it will appear in the stack trace.
 */