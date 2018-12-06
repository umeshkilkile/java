package com.inheritance;

/*
 * - In Java fields cannot be overridden in a subclass. If you define a field in a subclass with the same name as a field in the superclass, the field in the subclass will hide (shadow) the field in the superclass. If the subclass tries to access the field, it will access the field in the subclass.

   - If, however, the subclass calls up into a method in the superclass, and that method accesses the field with the same name as in the subclass, it is the field in the superclass that is accessed.
 */
public class Demo_6 {
	public static void main(String[] args) {
		Car1 car = new Car1();

		car.setLicensePlate("123");
		car.updateLicensePlate("abc");

		System.out.println("license plate: " + car.getLicensePlate());

		System.out.println(car.licensePlate);

	}
}
