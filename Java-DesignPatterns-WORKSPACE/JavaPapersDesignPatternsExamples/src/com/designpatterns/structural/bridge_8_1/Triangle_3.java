package com.designpatterns.structural.bridge_8_1;

public class Triangle_3 extends Shape_2 {

	public Triangle_3(Color_1 c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}

}
