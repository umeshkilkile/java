package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperationsSeq_Ex_4 {
	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println(menu);

		List<String> lowCalDishName = menu.stream().filter(d -> {
			System.out.println("filtering = " + d.getCalories());
			return d.getCalories() < 400;
		})
				// .sorted(Comparator.comparing(Dish::getCalories))
				.map(
						// Dish::getName
						d -> {
							System.out.println("mapping = " + d.getName());
							return d.getName();
						})
				.collect(Collectors.toList());
		System.out.println(lowCalDishName);

		/*
		 * Terminal operations produce a result from a stream pipeline. A result
		 * is any nonstream value such as a List, an Integer, or even void.
		 */
		menu.stream().forEach(System.out::println);

		long count = menu.stream().filter(d -> d.getCalories() > 300).distinct().limit(3).count();
		System.out.println("count = " + count);

	}
}

/*
 * Notes: Despite the fact that filter and map are two separate operations, they
 * were merged into the same pass (we call this technique loop fusion).
 */
