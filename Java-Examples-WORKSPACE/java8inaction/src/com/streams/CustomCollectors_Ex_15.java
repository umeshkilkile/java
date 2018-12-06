package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomCollectors_Ex_15 {
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println("menu = " + menu);

		List<Dish> dishes = menu.stream().collect(new ToListCollector<Dish>());
		System.out.println("dishes = " + dishes);

		/*
		 * Performing a custom collect without creating a Collector
		 * implementation
		 */
		List<Dish> dishes2 = menu.stream().collect(ArrayList::new, List::add, List::addAll);
		System.out.println("dishes2 = " + dishes2);
	}
}

/*
 * - collect is a terminal operation that takes as argument various recipes
 * (called collectors) for accumulating the elements of a stream into a summary
 * result.
 * 
 * - Predefined collectors include reducing and summarizing stream elements into
 * a single value, such as calculating the minimum, maximum, or average.
 * 
 * - Predefined collectors let you group elements of a stream with groupingBy
 * and partition elements of a stream with partitioningBy.
 * 
 * - Collectors compose effectively to create multilevel groupings, partitions,
 * and reductions.
 * 
 * - You can develop your own collectors by implementing the methods defined in
 * the Collector interface.
 */
