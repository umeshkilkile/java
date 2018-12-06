package com.designpatterns.creational.prototype_5;

/**
 * When creating an object is time consuming and a costly affair and you already
 * have a most similar object instance in hand, then you go for prototype
 * pattern. Instead of going through a time consuming process to create a
 * complex object, just copy the existing similar object and modify it according
 * to your needs.
 */
public class Bike_1 implements Cloneable {
	private int gears;
	private String bikeType;
	private String model;

	public Bike_1() {
		bikeType = "Standard";
		model = "Leopard";
		gears = 4;
	}

	public Bike_1 clone() {
		return new Bike_1();
	}

	public void makeAdvanced() {
		bikeType = "Advanced";
		model = "Jaguar";
		gears = 6;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Biketype : " + bikeType);
		sb.append(", Model : " + model);
		sb.append(", Gears : " + gears);

		return sb.toString();
	}
}
