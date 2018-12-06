package com.designpatterns.structural.adapter.using_inheritance_7_1_1;

public class RectangularPlug_3 {
	private String rectaStem1 = "12 v";
	private String rectaStem2 = "12 v";

	public String getPower() {
		RectangularAdapter_2 adapter = new RectangularAdapter_2();
		String power = adapter.adapt(rectaStem1, rectaStem2);
		return power;
	}
}
