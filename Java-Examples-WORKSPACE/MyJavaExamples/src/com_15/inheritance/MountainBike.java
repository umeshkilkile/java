package com_15.inheritance;

/*
 * A subclass inherits all of the public and protected members of its parent, no matter what package the subclass is in. 
 * If the subclass is in the same package as its parent, it also inherits the package-private members of the parent.
 */
public class MountainBike extends Bicycle {
	// the MountainBike subclass adds one field
	public int seatHeight;

	// the MountainBike subclass has one constructor
	public MountainBike(int startHeight, int startCadence, int startSpeed,
			int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
	}

	// the MountainBike subclass adds one method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	public int getSeatheight() {
		return seatHeight;
	}
}
