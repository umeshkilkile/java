package com.lambdasinaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringFruits_Ex2 {

	public static void main(String[] args) {

		List<Apple> appleInventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"),
				new Apple(120, "red"));
		List<Apple> redApples = filter(appleInventory, (Apple a) -> "green".equals(a.getColor()));

		System.out.println("redApples = " + redApples);

		// List<String> evenNumbers = filter(numbers, (Integer i) -> i % 2 ==
		// 0);
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T e : list) {
			System.out.println(e + p.toString());
			if (p.test(e)) {
				System.out.println("111");
				result.add(e);
			}
		}
		return list;
	}

}
