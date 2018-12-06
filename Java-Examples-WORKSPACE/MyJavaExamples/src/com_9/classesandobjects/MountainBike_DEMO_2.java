package com_9.classesandobjects;

/**
 * 
 * MountainBike inherits all the fields and methods of Bicycle and adds the
 * field seatHeight and a method to set it
 *
 */
public class MountainBike_DEMO_2 extends Bicycle_DEMO_1 {
	// the MountainBike subclass has one field
	public int seatHeight;

	// the MountainBike subclass has one constructor
	public MountainBike_DEMO_2(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
	}

	// the MountainBike subclass has one method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
}
