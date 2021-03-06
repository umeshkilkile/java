package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndSlicingWithStreams_Ex_5 {
	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println("menu = " + menu);

		// Filtering with a Predicate
		List<Dish> vegetarianDishes = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
		System.out.println("vegetarianDishes = " + vegetarianDishes);

		// Filtering unique elements
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);

		// Truncating a stream
		List<Dish> dishes = menu.stream().filter(d -> d.getCalories() > 300).limit(3).collect(Collectors.toList());
		System.out.println("dishes = " + dishes);

		// Skipping elements
		List<Dish> dishes2 = menu.stream().filter(d -> d.getCalories() > 300).skip(2).collect(Collectors.toList());
		System.out.println("dishes2 = " + dishes2);

		List<Dish> dishes3 = menu.stream().filter(d -> d.getType() == com.streams.Dish.Type.MEAT).limit(2)
				.collect(Collectors.toList());
		System.out.println("dishes3 = " + dishes3);
	}
}

/*
 * The Streams interface supports a filter method. This operation takes as
 * argument a predicate (a function returning a boolean) and returns a stream
 * including all elements that match the predicate.
 */