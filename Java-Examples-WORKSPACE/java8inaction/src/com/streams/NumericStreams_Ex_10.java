package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreams_Ex_10 {
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println("menu = " + menu);

		int calories = menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
		System.out.println("calories = " + calories);
		// The problem with this code is that there�s an insidious boxing cost.

		/*
		 * Java 8 introduces three primitive specialized stream interfaces to
		 * tackle this issue, IntStream, DoubleStream, and LongStream, that
		 * respectively specialize the elements of a stream to be int, long, and
		 * double�and thereby avoid hidden boxing costs.
		 */
		int calories2 = menu.stream().mapToInt(Dish::getCalories).sum();
		System.out.println("calories2 = " + calories2);

		// Converting Stream to a numeric stream
		IntStream intStream = menu.stream().mapToInt(Dish::getCalories);
		System.out.println(intStream.count());

		// Converting the numeric stream to a Stream
		// Stream<Integer> stream = intStream.boxed();

		OptionalInt maxCalories = menu.stream().mapToInt(Dish::getCalories).max();
		System.out.println("maxCalories = " + maxCalories.getAsInt());

		int max = maxCalories.orElse(1);
		System.out.println("max = " + max);

		// Numeric ranges
		IntStream evenNum = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0);
		System.out.println("evenNum = " + evenNum.count());
	}
}
