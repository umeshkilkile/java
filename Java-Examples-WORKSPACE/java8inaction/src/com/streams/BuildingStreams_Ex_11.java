package com.streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class BuildingStreams_Ex_11 {
	public static void main(String[] args) {
		// Streams from values
		Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
		stream.map(String::toUpperCase).forEach(System.out::println);

		// an empty stream using the empty method
		Stream<String> emptyStream = Stream.empty();

		// Streams from arrays
		int[] numbers = { 2, 3, 5, 7, 11, 13 };
		int sum = Arrays.stream(numbers).sum();
		System.out.println("sum = " + sum);

		// Streams from files
		long uniqueWords = 0;
		try (Stream<String> lines = Files.lines(Paths.get("Notes.txt"), Charset.defaultCharset())) {
			uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();
			System.out.println("uniqueWords = " + uniqueWords);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Streams from functions: creating infinite streams
		/*
		 * The Streams API provides two static methods to generate a stream from
		 * a function: Stream.iterate and Stream.generate. These two operations
		 * let you create what we call an infinite stream: a stream that doesn�t
		 * have a fixed size like when you create a stream from a fixed
		 * collection. Streams produced by iterate and generate create values on
		 * demand given a function and can therefore calculate values forever!
		 * It�s generally sensible to use limit(n) on such streams to avoid
		 * printing an infinite number of values.
		 */
		// Streams Iterate
		Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);

		// Fibonacci tuples series
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(20)
				.forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10).map(t -> t[0])
				.forEach(System.out::println);

		// Generate
		/*
		 * Similarly to the method iterate, the method generate lets you produce
		 * an infinite stream of values computed on demand. But generate doesn�t
		 * apply successively a function on each new produced value. It takes a
		 * lambda of type Supplier<T> to provide new values. Let�s look at an
		 * example of how to use it:
		 */
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		
		
	}
}
