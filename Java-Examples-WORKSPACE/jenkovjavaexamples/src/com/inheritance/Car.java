package com.inheritance;

public class Car extends Vehicle {
	int numberOfSeats = 0;

	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}

	/*
	 * The Car class extends the Vehicle class, the protected field licensePlate
	 * from the Vehicle class is inherited by the Car class. When the
	 * licensePlate field is inherited, it is accessible inside a Car instance.
	 */
	public String getLicensePlate() {
		return this.licensePlate;
	}
}
