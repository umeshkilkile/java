package com.lambdasinaction;

import java.util.Arrays;
import java.util.List;

public class MethodReference_Ex11 {
	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
		System.out.println("Before sort : " + inventory);

		inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
		System.out.println("After sort on weight : " + inventory);

		// After (using a method reference and java.util.Comparator.comparing):
		inventory.sort(java.util.Comparator.comparing(Apple::getColor));
		System.out.println("After sort on color : " + inventory);
	}
}
