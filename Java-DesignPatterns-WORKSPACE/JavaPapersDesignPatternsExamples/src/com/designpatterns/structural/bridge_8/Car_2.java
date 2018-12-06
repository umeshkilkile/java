package com.designpatterns.structural.bridge_8;

/**
 * Refine abstraction 1 in bridge pattern
 */
public class Car_2 extends Vehicle_1 {

	public Car_2(Workshop_4 workShop1, Workshop_4 workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Car ");
		workShop1.work();
		workShop2.work();
	}
}