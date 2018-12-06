package com.designpatterns.structural.bridge_8_1;

public class BridgeDesignPattern_Demo_7 {
	public static void main(String[] args) {
		Shape_2 tri = new Triangle_3(new RedColor_5());
		tri.applyColor();

		Shape_2 pent = new Pentagon_4(new GreenColor_6());
		pent.applyColor();
	}
}
