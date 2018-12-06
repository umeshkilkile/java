package com.inheritance;

public class Demo_4 {
	public static void main(String[] args) {
		Car car = new Car();

		/*
		 * upcasting: You can always cast an object of a subclass to one of its
		 * superclasses. This is referred to as upcasting (from a subclass type
		 * to a superclass type).
		 */
		// upcast to Vehicle
		Vehicle vehicle = car;

		/*
		 * downcasting: It may also be possible to cast an object from a
		 * superclass type to a subclass type, but only if the object really is
		 * an instance of that subclass (or an instance of a subclass of that
		 * subclass). This is referred to as downcasting (from a superclass type
		 * to a subclass type).
		 */
		// downcast to car again
		Car car2 = (Car) vehicle;

		/*
		 * - However, the following downcast example is not valid. The Java
		 * compiler will accept it, but at runtime when this code is executed
		 * the code will throw a ClassCastException.
		 * 
		 * - The Truck object can be upcast to a Vehicle object, but it cannot
		 * be downcast to a Car object later. This will result in a
		 * ClassCastException.
		 */
		Truck truck = new Truck();

		// upcast to Vehicle
		Vehicle vehicle2 = truck;

		// downcast to car again
		Car car3 = (Car) vehicle2;
	}
}
