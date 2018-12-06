package com.optional;

import java.util.Optional;

public class Optional_Ex_4 {
	public static void main(String[] args) {
	}

	// Combining two Optionals
	public Optional<Insurance> nullSafeFindCheapestInsurance(Optional<Person> person, Optional<Car> car) {
		if (person.isPresent() && car.isPresent()) {
			return Optional.of(findCheapestInsurance(person.get(), car.get()));
		} else {
			return Optional.empty();
		}
	}

	// Combining two optionals without unwrapping them
	public Optional<Insurance> nullSafeFindCheapestInsurance2(Optional<Person> person, Optional<Car> car) {
		return person.flatMap(p -> car.map(c -> findCheapestInsurance(p, c)));
	}

	public Insurance findCheapestInsurance(Person person, Car car) {
		// queries services provided by the different insurance companies
		// compare all those data
		return new Insurance();
	}
}
