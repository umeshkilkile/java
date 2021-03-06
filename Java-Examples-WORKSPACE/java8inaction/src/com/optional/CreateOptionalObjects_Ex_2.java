package com.optional;

import java.util.Optional;

public class CreateOptionalObjects_Ex_2 {
	public static void main(String[] args) {
		/*
		 * 1: Empty optional
		 * 
		 * You can get hold of an empty optional object using the static factory
		 * method Optional.empty:
		 */
		Optional<Car> optCar = Optional.empty();

		/*
		 * 2: Optional from a non-null value
		 * 
		 * You can also create an optional from a non-null value with the static
		 * factory method Optional.of:
		 */
		Car car = new Car();
		Optional<Car> optCar1 = Optional.of(car);

		/*
		 * 3: Optional from null
		 * 
		 * The static factory method Optional.ofNullable, you can create an
		 * Optional object that may hold a null value
		 */
		Optional<Car> optCar2 = Optional.ofNullable(car);

	}
}
