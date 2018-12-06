package com.lambdasinaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RealWorld_Ex3 {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
		System.out.println("Before sort : " + inventory);

		// 1- Creating an ad hoc implementation of Comparator
		inventory.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getWeight().compareTo(o2.getWeight());
			}
		});
		System.out.println("After sort-1 = " + inventory);

		// With type inference
		inventory.sort((o1, o2) -> o1.getColor().compareTo(o2.getColor()));
		System.out.println("After sort-2 = " + inventory);

		// Without type inference
		inventory.sort((Apple o1, Apple o2) -> o1.getColor().compareTo(o2.getColor()));
		System.out.println("After sort-2 = " + inventory);

		inventory.sort((Apple o1, Apple o2) -> o2.getWeight().compareTo(o1.getWeight()));
		System.out.println("After sort-3 DECENDING = " + inventory);
	}
}
