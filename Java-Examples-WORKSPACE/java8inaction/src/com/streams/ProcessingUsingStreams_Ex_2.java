package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingUsingStreams_Ex_2 {
	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println(menu);

		/*
		 * Before Java 7
		 */
		List<Dish> lowCaloriesDishes = new ArrayList<>();
		for (Dish d : menu) {
			// Filter the elements using an accumulator
			if (d.getCalories() < 400) {
				lowCaloriesDishes.add(d);
			}
		}

		// Sort the dishes with an anonymous class
		Collections.sort(lowCaloriesDishes, new Comparator<Dish>() {
			@Override
			public int compare(Dish o1, Dish o2) {
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});

		List<String> lowCaloriesDishesname = new ArrayList<>();
		for (Dish d : lowCaloriesDishes) {
			lowCaloriesDishesname.add(d.getName());
		}
		System.out.println(lowCaloriesDishesname);

		/*
		 * After Java 8
		 */
		List<String> lowCalDishName = menu.stream().filter(d -> d.getCalories() < 400)
				.sorted(Comparator.comparing(Dish::getCalories)).map(Dish::getName).collect(Collectors.toList());
		System.out.println(lowCalDishName);

		// To exploit a multicore architecture and execute this code in
		// parallel, you need only change stream() to parallelStream():
		List<String> lowCalDishName2 = menu.parallelStream().filter(d -> d.getCalories() < 400)
				.sorted(Comparator.comparing(Dish::getCalories)).map(Dish::getName).collect(Collectors.toList());
		System.out.println(lowCalDishName2);

		List<String> threeHighCalDishNames = menu.stream().filter(d -> d.getCalories() > 300).map(Dish::getName)
				.limit(3).collect(Collectors.toList());
		System.out.println("threeHighCalDishNames = " + threeHighCalDishNames);
	}
}
