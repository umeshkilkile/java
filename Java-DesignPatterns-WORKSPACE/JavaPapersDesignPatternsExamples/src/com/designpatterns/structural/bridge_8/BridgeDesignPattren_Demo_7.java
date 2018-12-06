package com.designpatterns.structural.bridge_8;

/*
 * Demonstration of bridge design pattern
 */
public class BridgeDesignPattren_Demo_7 {

	public static void main(String[] args) {

		Vehicle_1 vehicle1 = new Car_2(new Produce_5(), new Assemble_6());
		vehicle1.manufacture();
		Vehicle_1 vehicle2 = new Bike_3(new Produce_5(), new Assemble_6());
		vehicle2.manufacture();

	}
}