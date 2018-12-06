package com_15.inheritance;

public class MethodOverriding_DEMO_2 {
	public static void main(String[] args) {
		Car car = new Car();
		String carDetails = car.getCarDetails();
		System.out.println(carDetails);
		
		Car car2 = new Car_BMW();
		carDetails = car2.getCarDetails();
		System.out.println(carDetails);
	}
}
