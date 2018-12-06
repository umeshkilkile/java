package com.designpatterns.structural.bridge_8_1;

public class Pentagon_4 extends Shape_2 {

	public Pentagon_4(Color_1 c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}
}