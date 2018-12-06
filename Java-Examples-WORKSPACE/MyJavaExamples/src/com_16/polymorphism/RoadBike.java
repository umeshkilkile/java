package com_16.polymorphism;

public class RoadBike extends Bicycle {
	// In millimeters (mm)
	private int tireWidth;

	public RoadBike(int startCadence, int startSpeed, int startGear,
			int newTireWidth) {
		super(startCadence, startSpeed, startGear);
		this.setTireWidth(newTireWidth);
	}

	public int getTireWidth() {
		return this.tireWidth;
	}

	public void setTireWidth(int newTireWidth) {
		this.tireWidth = newTireWidth;
	}

	/*
	 * Note that once again, the printDescription method has been overridden.
	 * This time, information about the tire width is displayed.
	 */
	@Override
	public void printDescription() {
		super.printDescription();
		System.out.println("The RoadBike" + " has " + getTireWidth()
				+ " MM tires.");
	}
}
