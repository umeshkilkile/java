package com.designpatterns.structural.adapter.using_composition_7_2_1;

public class RectangularAdapter_2 {
	private CylindricalSocket_1 socket;

	public String adapt(String rectaStem1, String rectaStem2) {
		// some conversion logic
		socket = new CylindricalSocket_1();
		String cylinStem1 = rectaStem1;
		String cylinStem2 = rectaStem2;
		return socket.supply(cylinStem1, cylinStem2);
	}

}
