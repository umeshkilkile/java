package com.reusing.classes;

public class SprinklerSystem_Demo {
	private String valve1, valve2, valve3, valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;

	public String toString() {
		return "valve1 = " + valve1 + " " + "valve2 = " + valve2 + " " + "valve3 = " + valve3 + " " + "valve4 = "
				+ valve4 + "\n" + "i = " + i + " " + "f = " + f + " " + "source = " + source;
	}

	public static void main(String[] args) {
		SprinklerSystem_Demo sprinklers = new SprinklerSystem_Demo();
		System.out.println(sprinklers);
	}
}

/*
 * Composition syntax
 * 
 * - You simply place object references inside new classes
 */
