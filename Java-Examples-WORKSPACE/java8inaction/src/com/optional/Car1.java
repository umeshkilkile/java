package com.optional;

import java.util.Optional;

public class Car1 {
	/*
	 * A car might or might not be insured, so you declare this field Optional.
	 */
	private Optional<Insurance1> insurance;

	public Optional<Insurance1> getInsurance() {
		return insurance;
	}
}
