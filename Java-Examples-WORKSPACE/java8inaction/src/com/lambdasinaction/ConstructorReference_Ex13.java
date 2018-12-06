package com.lambdasinaction;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference_Ex13 {
	public static void main(String[] args) {

		// A constructor reference to the default Apple() constructor
		Supplier<Apple> c1 = Apple::new;
		// Callig Supplier's get method will produce a new Apple
		Apple a1 = c1.get();
		System.out.println("a1 = " + a1);

		/*
		 * The above code is equivalent to
		 */
		// A lambda expression creating an Apple with default constructor
		Supplier<Apple> c2 = () -> new Apple();
		// Callig Supplier's get method will produce a new Apple
		Apple a2 = c2.get();
		System.out.println("a2 = " + a2);

		// A constructor reference to Apple(Integer Weight)
		Function<Integer, Apple> c3 = Apple::new;
		// Calling the Function's apply method with the requested weight will
		// produce the Apple
		Apple a3 = c3.apply(110);
		System.out.println("a3 = " + a3);

		/*
		 * The above code is equivalent to
		 */
		// A lambda expression creating an Apple with requested weight
		Function<Integer, Apple> c4 = (weight) -> new Apple(weight);
		Apple a4 = c4.apply(110);
		System.out.println("a4 = " + a4);

		// A constructor reference to Apple(Integer Weight, String color)
		BiFunction<Integer, String, Apple> c5 = Apple::new;
		Apple a5 = c5.apply(119, "Yellow");
		System.out.println("a5 = " + a5);
		/*
		 * The above code is equivalent to
		 */
		BiFunction<Integer, String, Apple> c6 = (weight, color) -> new Apple(weight, color);
		Apple a6 = c6.apply(112, "GREEN");
		System.out.println("a6 = " + a6);
	}
}
