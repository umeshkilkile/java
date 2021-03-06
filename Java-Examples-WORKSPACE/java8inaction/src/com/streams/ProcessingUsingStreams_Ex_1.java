package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.lambdasinaction.Apple;

public class ProcessingUsingStreams_Ex_1 {
	public static void main(String[] args) {

		/*
		 * Sequential Processing
		 */
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

		List<Apple> heavyApples = inventory.stream().filter((Apple a) -> a.getWeight() > 150)
				.collect(Collectors.toList());
		System.out.println("Heavy apples =  " + heavyApples);

		/*
		 * Parallel processing
		 */
		List<Apple> heavyApples2 = inventory.parallelStream().filter((Apple a) -> a.getWeight() > 150)
				.collect(Collectors.toList());
		System.out.println("Heavy apples2 =  " + heavyApples2);
	}
}
