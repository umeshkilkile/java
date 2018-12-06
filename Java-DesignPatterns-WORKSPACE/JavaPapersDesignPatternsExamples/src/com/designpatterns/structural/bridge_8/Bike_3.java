package com.designpatterns.structural.bridge_8;

/**
 * Refine abstraction 2 in bridge pattern
 */
public class Bike_3 extends Vehicle_1 {

	public Bike_3(Workshop_4 workShop1, Workshop_4 workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		workShop1.work();
		workShop2.work();
	}

}