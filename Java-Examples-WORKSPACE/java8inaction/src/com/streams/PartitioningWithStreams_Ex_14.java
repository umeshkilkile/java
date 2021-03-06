package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartitioningWithStreams_Ex_14 {
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		System.out.println("menu = " + menu);

		// Partitioning
		Map<Boolean, List<Dish>> partitionedMenu = menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
		System.out.println("partitionedMenu = " + partitionedMenu);
		System.out.println("partitionedMenu (Vegeterian) = " + partitionedMenu.get(true));
		System.out.println("partitionedMenu (Non Vegeterian) = " + partitionedMenu.get(false));

		// The above can be done as follows,
		List<Dish> vegetarianDishes = menu.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
		System.out.println("vegetarianDishes = " + vegetarianDishes);

		Map<Boolean, Map<Dish.Type, List<Dish>>> vegeterianDishesByType = menu.stream()
				.collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.groupingBy(Dish::getType)));
		System.out.println("vegeterianDishesByType = " + vegeterianDishesByType);

		Map<Boolean, Dish> mostCaloricPartitionedByVegetarian = menu.stream()
				.collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)), Optional::get)));
		System.out.println("mostCaloricPartitionedByVegetarian = " + mostCaloricPartitionedByVegetarian);

		Map<Boolean, Map<Boolean, List<Dish>>> mostCaloricPartitionedByVegetarian2 = menu.stream().collect(
				Collectors.partitioningBy(Dish::isVegetarian, Collectors.partitioningBy(d -> d.getCalories() > 500)));
		System.out.println("mostCaloricPartitionedByVegetarian2 = " + mostCaloricPartitionedByVegetarian2);

		Map<Boolean, Long> itemsInPartition = menu.stream()
				.collect(Collectors.partitioningBy(Dish::isVegetarian, Collectors.counting()));
		System.out.println("itemsInPartition = " + itemsInPartition);

		// Partitioning numbers into prime and nonprime

		Map<Boolean, List<Integer>> numbers = partitionPrimes(100);
		System.out.println("numbers = " + numbers);

	}

	public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
		return IntStream.rangeClosed(2, n).boxed().collect(Collectors.partitioningBy(candidate -> isPrime(candidate)));
	}

	public static boolean isPrime(int candidate) {
		int candidateRoot = (int) Math.sqrt((double) candidate);
		return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i == 0);
	}

}

/*
 * Partitioning is a special case of grouping: having a predicate (a function
 * returning a boolean), called a partitioning function, as a classification
 * function. The fact that the partitioning function returns a boolean means the
 * resulting grouping Map will have a Boolean as a key type and therefore there
 * can be at most two different groups�one for true and one for false.
 */