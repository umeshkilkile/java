package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectDataWithStreams_Ex_12 {
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println("menu = " + menu);

		// Reducing and summarizing
		long howManyDishes = menu.stream().collect(Collectors.counting());
		System.out.println("howManyDishes = " + howManyDishes);

		long howManyDishes2 = menu.stream().count();
		System.out.println("howManyDishes2 = " + howManyDishes2);

		// Finding maximum and minimum in a stream of values

		// E.g.,Find the highest-calorie dish in the menu
		Comparator<Dish> dishCalorieComparator = Comparator.comparingInt(Dish::getCalories);
		Optional<Dish> mostCalorieDish = menu.stream().collect(Collectors.maxBy(dishCalorieComparator));
		System.out.println("mostCalorieDish = " + mostCalorieDish);

		// Summarization
		int totalCalories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
		System.out.println("totalCalories = " + totalCalories);

		// Average
		double avgCalories = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
		System.out.println("avgCalories = " + avgCalories);

		IntSummaryStatistics menuStatistics = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
		System.out.println("menuStatistics = " + menuStatistics);

		// Joining Strings
		String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining());
		System.out.println("shortMenu = " + shortMenu);
		// Note that above joining internally makes use of a StringBuilder to
		// append the generated strings into one.

		String shortMenu2 = menu.stream().map(Dish::getName).collect(Collectors.joining(","));
		System.out.println("shortMenu2 = " + shortMenu2);

		// Generalized summarization with reduction
		int totalCalories2 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (i, j) -> i + j));
		System.out.println("totalCalories2 = " + totalCalories2);

		Optional<Dish> mostCalorieDish2 = menu.stream()
				.collect(Collectors.reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
		System.out.println("mostCalorieDish2 = " + mostCalorieDish2.get());

		// Collection framework flexibility: doing the same operation in
		// different ways
		int totalCalories3 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
		System.out.println("totalCalories3 = " + totalCalories3);

		int totalCalories4 = menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
		System.out.println("totalCalories4 = " + totalCalories4);

		int totalCalories5 = menu.stream().mapToInt(Dish::getCalories).sum();
		System.out.println("totalCalories5 = " + totalCalories5);

		// Joining strings with reducing
		/*
		 * This converts each dish in its name, as done by the original
		 * statement using the joining collector, and then reduces the resulting
		 * stream of strings using a String as accumulator and appending to it
		 * the names of the dishes one by one.
		 */
		String shortMenu3 = menu.stream().map(Dish::getName).collect(Collectors.reducing((s1, s2) -> s1 + s2)).get();
		System.out.println("shortMenu3 = " + shortMenu3);

		/*
		 * This starts the reduction process with an empty string as the
		 * accumulator, and when traversing the stream of dishes it converts
		 * each dish to its name and appends this name to the accumulator.
		 */
		String shortMenu4 = menu.stream().collect(Collectors.reducing("", Dish::getName, (s1, s2) -> s1 + s2));
		System.out.println("shortMenu4 = " + shortMenu4);

	}
}

/*
 * collect is a reduction operation, just like reduce
 */
