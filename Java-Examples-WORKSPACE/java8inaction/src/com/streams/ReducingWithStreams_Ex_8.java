package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingWithStreams_Ex_8 {
	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println("menu = " + menu);

		// Summing the elements
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum = " + sum);
		int sum2 = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Sum2 = " + sum2);
		int sump = numbers.parallelStream().reduce(0, Integer::sum);
		System.out.println("Sump = " + sump);
		
		// No initial value
		Optional<Integer> sum3 = numbers.stream().reduce((a, b) -> (a + b));
		System.out.println("Sum3 = " + sum3.get());

		int product = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Product = " + product);

		// Maximum and minimum
		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		System.out.println("Max = " + max.get());

		Optional<Integer> min = numbers.stream().reduce(Integer::min);
		System.out.println("Min = " + min.get());

		int count = menu.stream().map(d -> 1).reduce(0, (a, b) -> a + b);
		System.out.println("Count = " + count);
		
		long count2 = menu.stream().count();
		System.out.println("Count2 = " + count2);
	}
}
/*
 * A chain of map and reduce is commonly known as the map-reduce pattern, made
 * famous by Google’s use of it for web searching because it can be easily
 * parallelized.
 */