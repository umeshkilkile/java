package com.lambdasinaction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * - The java.util.function.Consumer<T> interface defines an abstract method named accept that
	takes an object of generic type T and returns no result (void).
	
	- use this interface when you need to access an object of type T and perform some operations on it.
 */
public class LambdaExpressions_Consumer_Ex8 {
	public static void main(String[] args) {
		forEachDo(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
	}

	public static <T> void forEachDo(List<T> list, Consumer<T> c) {
		for (T i : list) {
			c.accept(i);
		}
	}
}
