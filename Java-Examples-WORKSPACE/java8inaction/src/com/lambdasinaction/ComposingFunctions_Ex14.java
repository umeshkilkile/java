package com.lambdasinaction;

import java.util.function.Function;

public class ComposingFunctions_Ex14 {
	public static void main(String[] args) {

		Function<Integer, Integer> f = x -> x + 1;
		System.out.println("f = " + f.apply(1));

		Function<Integer, Integer> f2 = x -> x * 2;
		System.out.println("f2 = " + f2.apply(1));

		Function<Integer, Integer> f3 = f.andThen(f2);
		int result = f3.apply(1);
		System.out.println("Result = " + result);

		Function<Integer, Integer> f4 = f.compose(f2);
		int result2 = f4.apply(1);
		System.out.println("Result2 = " + result2);
	}
}
