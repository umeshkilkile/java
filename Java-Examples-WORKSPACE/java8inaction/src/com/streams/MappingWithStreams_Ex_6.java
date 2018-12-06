package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingWithStreams_Ex_6 {
	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println("menu = " + menu);

		// Applying a function to each element of a stream
		List<String> dishNames = menu.stream().map(Dish::getName).collect(Collectors.toList());
		System.out.println("dishNames = " + dishNames);
		
		List<Integer> dishNames2 = menu.stream().map(Dish::getCalories).collect(Collectors.toList());
		System.out.println("dishNames2 = " + dishNames2);
		
		

		List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
		List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println(wordLengths);

		List<Integer> dishNameLengths = menu.stream().map(Dish::getName).map(String::length)
				.collect(Collectors.toList());
		System.out.println("dishNameLengths = " + dishNameLengths);

		// Flattening streams
		List<String[]> letter = words.stream().map(word -> word.split("")).distinct().collect(Collectors.toList());
		System.out.println("letter = " + letter);

		/*
		 * The problem with above approach is that the lambda passed to the map
		 * method returns a String[] (an array of String) for each word. So the
		 * stream returned by the map method is actually of type
		 * Stream<String[]>. What you really want is Stream<String> to represent
		 * a stream of characters.
		 */

		// Attempt using map and Arrays.stream
		words.stream().map(word -> word.split("")).map(Arrays::stream).distinct().collect(Collectors.toList());

		/*
		 * The above solution still doesn’t work! This is because you now end up
		 * with a list of streams (more precisely, Stream<Stream<String>>)!
		 * Indeed, you first convert each word into an array of its individual
		 * letters and then make each array into a separate stream.
		 */
		// You can fix this problem by using flatMap
		List<String> uniqueCharacters = words.stream().map(w -> w.split("")).flatMap(Arrays::stream).distinct()
				.collect(Collectors.toList());
		System.out.println("uniqueCharacters = " + uniqueCharacters);
		/*
		 * Using the flatMap method has the effect of mapping each array not
		 * with a stream but with the contents of that stream. All the separate
		 * streams that were generated when using map(Arrays::stream) get
		 * amalgamated—flattened into a single stream.
		 * 
		 * In a nutshell, the flatMap method lets you replace each value of a
		 * stream with another stream and then concatenates all the generated
		 * streams into a single stream.
		 */

		/*
		 * Examples
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("squares = " + squares);

		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs = numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[] { i, j }))
				.collect(Collectors.toList());
		System.out.println("pairs = " + pairs);

		for (int[] a : pairs) {
			for (int i : a) {
				System.out.println(i);
			}
		}

		List<int[]> pairs2 = numbers1.stream()
				.flatMap(i -> numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[] { i, j }))
				.collect(Collectors.toList());
		System.out.println("pairs2 = " + pairs2);
		for (int[] a : pairs2) {
			for (int i : a) {
				System.out.println(i);
			}
		}
	}
}
/*
 * Streams support the method map, which takes a function as argument. The
 * function is applied to each element, mapping it into a new element (the word
 * mapping is used because it has a meaning similar to transforming but with the
 * nuance of “creating a new version of” rather than “modifying”).
 */