package com.refactoringoldcode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Examining values flowing in a stream pipeline with peek
 * 
 * - The peek method of a stream is useful to log intermediate values as they flow past at certain points in a stream pipeline.
 */
public class Peek_Ex_18 {
	public static void main(String[] args) {

		List<Integer> result = Stream.of(2, 3, 4, 5).peek(x -> System.out.println("taking from stream: " + x))
				.map(x -> x + 17).peek(x -> System.out.println("after map: " + x)).filter(x -> x % 2 == 0)
				.peek(x -> System.out.println("after filter: " + x)).limit(3)
				.peek(x -> System.out.println("after limit: " + x)).collect(Collectors.toList());

		System.out.println("result = " + result);
	}
}
