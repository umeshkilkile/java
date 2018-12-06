package com.inheritance;

public class Demo_3 {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.licensePlate);
		System.out.println(car.numberOfSeats);

		/*
		 * - It is possible to reference a subclass as an instance of one of its
		 * superclasses
		 * 
		 * - Now the Vehicle variable (reference) points to the Car instance.
		 * This is possible because the Car class inherits from the Vehicle
		 * class.
		 */
		Vehicle vehicle = car;
		System.out.println(vehicle.licensePlate);
	}
}
