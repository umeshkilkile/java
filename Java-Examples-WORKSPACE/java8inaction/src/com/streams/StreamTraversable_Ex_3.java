package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * 	- Note that, similarly to iterators, a stream can be traversed only once. After that a stream is said to be consumed.
 *  - So keep in mind that you can consume a stream only once!
 */
public class StreamTraversable_Ex_3 {
	public static void main(String[] args) {
		List<String> title = Arrays.asList("Java8", "In", "Action");

		Stream<String> s = title.stream();
		s.forEach(System.out::println);
		s.forEach(System.out::println);
	}
}
