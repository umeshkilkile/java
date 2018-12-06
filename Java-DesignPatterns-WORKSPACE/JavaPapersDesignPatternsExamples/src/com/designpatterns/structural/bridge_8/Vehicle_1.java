package com.designpatterns.structural.bridge_8;

/**
 * abstraction in bridge pattern
 * */
abstract class Vehicle_1 {
	protected Workshop_4 workShop1;
	protected Workshop_4 workShop2;

	protected Vehicle_1(Workshop_4 workShop1, Workshop_4 workShop2) {
		this.workShop1 = workShop1;
		this.workShop2 = workShop2;
	}

	abstract public void manufacture();
}
