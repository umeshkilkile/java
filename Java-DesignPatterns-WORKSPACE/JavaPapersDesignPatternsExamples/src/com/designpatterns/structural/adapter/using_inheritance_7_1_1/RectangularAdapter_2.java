package com.designpatterns.structural.adapter.using_inheritance_7_1_1;

public class RectangularAdapter_2 extends CylindricalSocket_1 {

	public String adapt(String rectaStem1, String rectaStem2) {
		// some conversion logic
		String cylinStem1 = rectaStem1;
		String cylinStem2 = rectaStem2;
		return supply(cylinStem1, cylinStem2);
	}
}
