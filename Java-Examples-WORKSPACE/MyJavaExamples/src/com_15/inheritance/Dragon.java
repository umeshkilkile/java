package com_15.inheritance;

public class Dragon implements EggLayer, FireBreather {
	public static void main(String... args) {
		Dragon myApp = new Dragon();
		System.out.println(myApp.identifyMyself());
	}
}
