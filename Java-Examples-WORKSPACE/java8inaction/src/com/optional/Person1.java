package com.optional;

import java.util.Optional;

public class Person1 {
	/*
	 * A person might or might not own a car, so you declare this field Optional
	 */
	private Optional<Car1> car;

	public Optional<Car1> getCar() {
		return car;
	}
}
