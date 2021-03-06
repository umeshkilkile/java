package com_15.inheritance;

public class Inheritance_DEMO_1 {
	public static void main(String[] args) {
		MountainBike myBike = new MountainBike(1, 2, 3, 4);

		Bicycle byBicycle = new MountainBike(10, 20, 30, 40);

		Object object = new MountainBike(100, 200, 300, 400);

		/*
		 * Casting objects.
		 * 
		 * Casting shows the use of an object of one type in place of another
		 * type, among the objects permitted by inheritance and implementations.
		 */

		// Implicit casting
		Object obj = new MountainBike(1, 2, 3, 4);

		// Explicit casting
		MountainBike myBike2 = (MountainBike) obj;
		System.out.println(myBike2.getSeatheight());

		/*
		 * While casting its better use instanceof operator. Here the instanceof
		 * operator verifies that obj refers to a MountainBike so that we can
		 * make the cast with knowledge that there will be no runtime exception
		 * thrown.
		 */
		if (obj instanceof MountainBike) {
			MountainBike myBike3 = (MountainBike) obj;
		}
	}
}
