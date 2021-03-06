package com.lambdasinaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/*
 * Passing code: an example
 */
public class FilteringApples_Ex1 {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

		System.out.println("All apples in inventory : " + inventory);
		/*
		 * Before Java 8
		 */
		List<Apple> greenApplesOnly = filterGreenApples(inventory);
		System.out.println("greenApplesOnly = " + greenApplesOnly);

		List<Apple> heavyApplesOnly = filterHeavyApples(inventory);
		System.out.println("heavyApplesOnly = " + heavyApplesOnly);

		List<Apple> redApplesOnly = filterApplesByColor(inventory, "red");
		System.out.println("redApplesOnly = " + redApplesOnly);

		List<Apple> heavyApplesOnly2 = filterApplesByWeight(inventory, 120);
		System.out.println("heavyApplesOnly2 = " + heavyApplesOnly2);

		List<Apple> greenApples1 = filterApples(inventory, "green", 0, true);
		System.out.println("greenApples1 = " + greenApples1);

		List<Apple> heavyApples1 = filterApples(inventory, "", 150, false);
		System.out.println("heavyApples1 = " + heavyApples1);

		/*
		 * After Java 8
		 */
		List<Apple> greenApples = filterApples(inventory, FilteringApples_Ex1::isGreenApple);
		System.out.println("greenApples = " + greenApples);

		List<Apple> heavyApples = filterApples(inventory, FilteringApples_Ex1::isHeavyApple);
		System.out.println("heavyApples = " + heavyApples);

		// Explicit type on the parameter a
		List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
		System.out.println("greenApples2 = " + greenApples2);

		// No explicit type on the parameter a
		List<Apple> greenApples22 = filterApples(inventory, (a) -> "green".equals(a.getColor()));
		System.out.println("greenApples22 = " + greenApples22);

		List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
		System.out.println("heavyApples2 = " + heavyApples2);

		List<Apple> weirdApples = filterApples(inventory,
				(Apple a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));
		System.out.println("weirdApples = " + weirdApples);

	}

	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		// result is a List, which accumulates the result; it starts as empty,
		// and then green apples are added one by one
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			// The below line selects only green apples
			if ("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getColor().equalsIgnoreCase(color)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean flag) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterHeavyApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			// The below line selects only heavy apples
			if (apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		return result;
	}

	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}

	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}

	/*
	 * A method is passed as a Predicate parameter named p
	 */
	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			// Does the apple match the condition represented by p?
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}

/*
 * What�s a Predicate?
 * 
 * - The word predicate is often used in mathematics to mean something
 * function-like that takes a value for an argument and returns true or false.
 */