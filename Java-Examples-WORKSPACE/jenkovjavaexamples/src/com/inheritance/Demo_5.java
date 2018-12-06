package com.inheritance;

public class Demo_5 {
	public static void main(String[] args) {
		Car car = new Car();
		boolean isCar = car instanceof Car;
		System.out.println(isCar);

		boolean isVehicle = car instanceof Vehicle;
		System.out.println(isVehicle);

		Vehicle vehicle = car;
		boolean isCar1 = vehicle instanceof Car;
		System.out.println(isCar1);

		Truck truck = new Truck();
		Vehicle vehicle2 = truck;
		boolean isCar2 = vehicle2 instanceof Car;
		System.out.println(isCar2);
	}
}
