package com_9.classesandobjects;

/*
 * Using this with a Constructor
 */
public class This_with_constructor_DEMO_10 {
	private int x, y;
	private int width, height;

	public This_with_constructor_DEMO_10() {
		this(0, 0, 1, 1);
	}

	public This_with_constructor_DEMO_10(int width, int height) {
		this(0, 0, width, height);
	}

	public This_with_constructor_DEMO_10(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public static void main(String[] args) {
		// Calls no arg constructor
		This_with_constructor_DEMO_10 constructor_10 = new This_with_constructor_DEMO_10();
		System.out.println("X: " + constructor_10.x + ", Y: " + constructor_10.y + ", width: " + constructor_10.width + ", height: " + constructor_10.height);

		// 2 arg constructor
		This_with_constructor_DEMO_10 constructor_102 = new This_with_constructor_DEMO_10(10, 20);
		System.out.println("X: " + constructor_102.x + ", Y: " + constructor_102.y + ", width: " + constructor_102.width + ", height: " + constructor_102.height);

		// 3 arg constructor
		This_with_constructor_DEMO_10 constructor_103 = new This_with_constructor_DEMO_10(100, 200, 300, 400);
		System.out.println("X: " + constructor_103.x + ", Y: " + constructor_103.y + ", width: " + constructor_103.width + ", height: " + constructor_103.height);
	}
}
