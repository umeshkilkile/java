package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindingAndMatchingStreams_Ex_7 {
	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println("menu = " + menu);

		// Checking to see if a predicate matches at least one element
		if (menu.stream().anyMatch(Dish::isVegetarian)) {
			System.out.println("The menu is (somewhat) vegetarian friendly!");
		}

		// Checking to see if a predicate matches all elements
		boolean isHealthy = menu.stream().allMatch(d -> d.getCalories() < 1000);
		System.out.println("isHealthy = " + isHealthy);

		boolean isHealthy2 = menu.stream().noneMatch(d -> d.getCalories() >= 1000);
		System.out.println("isHealthy2 = " + isHealthy2);
		/*
		 * These three operations, anyMatch, allMatch, and noneMatch, make use
		 * of what we call short-circuiting, a stream version of the familiar
		 * Java short-circuiting && and || operators.
		 */

		// Finding an element
		Optional<Dish> dish = menu.stream().filter(Dish::isVegetarian).findAny();
		System.out.println("dish = " + dish);

		/*
		 * The Optional<T> class (java.util.Optional) is a container class to
		 * represent the existence or absence of a value.
		 */
		System.out.println("Using optional");
		menu.stream().filter(Dish::isVegetarian).findAny().ifPresent(d -> System.out.println(d.getName()));

		// Finding the first element

		List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream().map(x -> x * x).filter(x -> x % 3 == 0)
				.findFirst(); // 9
		System.out.println("firstSquareDivisibleByThree = " + firstSquareDivisibleByThree.get());
	}
}
