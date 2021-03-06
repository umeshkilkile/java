package com.micellaneous;

/*
 * Non-static instance initialization
 *		- Java provides a similar syntax, called instance initialization, for initializing non-static variables for each object.
 *		- From the output, you can see that the instance initialization clause is executed before either one of the constructors.
 */
public class Mugs_Demo {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 initialized");
	}

	Mugs_Demo() {
		System.out.println("Mugs()");
	}

	Mugs_Demo(int i) {
		System.out.println("Mugs(int)");
	}

	public static void main(String[] args) {
		System.out.println("Inside main()");
		new Mugs_Demo();
		System.out.println("new Mugs() completed");
		new Mugs_Demo(1);
		System.out.println("new Mugs(1) completed");
	}
}
