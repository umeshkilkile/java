package com.java8.streams_10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddSingleElementsToStream_1 {
	public static void main(String[] args) {
		Stream<Integer> anStream = Stream.of(1, 2, 3, 4, 5);

		// Prepending
		Stream<Integer> newStream = Stream.concat(Stream.of(99), anStream);
		System.out.println("First element = " + newStream.findFirst().get());

		// Appending
		Stream<String> anStream1 = Stream.of("a", "b", "c", "d", "e");
		Stream<String> newStream1 = Stream.concat(anStream1, Stream.of("A"));
		List<String> resultList = newStream1.collect(Collectors.toList());
		System.out.println("Last element = " + resultList.get(resultList.size() - 1));

		// At a Specific Index
		Stream<Double> anStream2 = Stream.of(1.1, 2.2, 3.3);
		Stream<Double> newStream2 = insertInStream(anStream2, 9.9, 3);
		List<Double> resultList1 = newStream2.collect(Collectors.toList());
		System.out.println("N th element = " + resultList1.get(3));

	}

	/*
	 * Streams are not collections and do not recognize the concept of indexes.
	 * 
	 * So, in order to do this, we need to convert the Stream to a list, then
	 * insert the element, and finally, get a Stream from that new list.
	 */
	public static <T> Stream<T> insertInStream(Stream<T> stream, T elem, int index) {
		List<T> result = stream.collect(Collectors.toList());
		result.add(index, elem);
		return result.stream();
	}
}
