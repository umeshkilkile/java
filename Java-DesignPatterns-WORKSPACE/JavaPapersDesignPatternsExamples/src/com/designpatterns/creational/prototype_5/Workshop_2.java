package com.designpatterns.creational.prototype_5;

public class Workshop_2 {
	public Bike_1 makeJaguar(Bike_1 basicBike) {
		basicBike.makeAdvanced();
		return basicBike;
	}

	public static void main(String args[]) {

		Bike_1 bike = new Bike_1();
		System.out.println("bike -> " + bike);
		
		Bike_1 basicBike = bike.clone();
		System.out.println("basicBike -> " + bike);

		Workshop_2 workShop = new Workshop_2();
		Bike_1 advancedBike = workShop.makeJaguar(basicBike);
		System.out.println("Prototype Design Pattern: advancedBike -> " + advancedBike);
		System.out.println("bike -> " + bike);
		System.out.println("basicBike -> " + bike);
	}

}
