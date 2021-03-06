package com.lambdasinaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;

/*
 *	Same lambda, different functional interfaces 
 */
public class LambdaExpressions_SameLambdaDiff_FI_Ex10 {

	public static void main(String[] args) {

		Comparator<Apple> c1                 = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
		ToIntBiFunction<Apple, Apple> c2     = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
		BiFunction<Apple, Apple, Integer> c3 = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
		System.out.println("Before sort : " + inventory);
		inventory.sort(c1);
		System.out.println("After sort : " + inventory);

		System.out.println("C2 = " + c2.applyAsInt(new Apple(80, "green"), new Apple(120, "red")));

		System.out.println("C3 = " + c3.apply(new Apple(80, "green"), new Apple(120, "red")));

	}

}
