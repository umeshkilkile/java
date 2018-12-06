package com.lambdasinaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions_Ex5 {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"),
				new Apple(880, "red"));
		System.out.println("Before sort = " + inventory);
		// Comparator way
		Comparator<Apple> byWeight = new Comparator<Apple>() {
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight().compareTo(a2.getWeight());
			}
		};
		inventory.sort(byWeight);
		System.out.println("After sort = " + inventory);

		/*
		 * Lambda parameters : (Apple a1, Apple a2)
		 * 
		 * -> : separates the list of parameters from the body of the lambda
		 * 
		 * Lambda body : a2.getWeight().compareTo(a1.getWeight()
		 */
		Comparator<Apple> byWeight1 = (Apple a1, Apple a2) -> a2.getWeight().compareTo(a1.getWeight());
		inventory.sort(byWeight1);
		System.out.println("After sort dec = " + inventory);

	}
}
