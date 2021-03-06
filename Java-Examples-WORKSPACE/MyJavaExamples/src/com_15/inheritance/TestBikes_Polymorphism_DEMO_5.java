package com_15.inheritance;

public class TestBikes_Polymorphism_DEMO_5 {
	public static void main(String[] args) {
		Bicycle bike01, bike02, bike03;

		bike01 = new Bicycle(20, 10, 1);
		bike02 = new MountainBike2(20, 10, 5, "Dual");
		bike03 = new RoadBike(40, 20, 8, 23);

		bike01.printDescription();
		bike02.printDescription();
		bike03.printDescription();
	}
}
