package com_16.polymorphism;

public class MountainBike extends Bicycle {
	private String suspension;

	public MountainBike(int startCadence, int startSpeed, int startGear,
			String suspensionType) {
		super(startCadence, startSpeed, startGear); //super keyword to invoke a superclass's constructor
		this.setSuspension(suspensionType);
	}

	public String getSuspension() {
		return this.suspension;
	}

	public void setSuspension(String suspensionType) {
		this.suspension = suspensionType;
	}

	/*
	 * Note the overridden printDescription method. In addition to the
	 * information provided before, additional data about the suspension is
	 * included to the output.
	 */

	@Override
	public void printDescription() {
		super.printDescription();
		System.out.println("The " + "MountainBike has a " + getSuspension()
				+ " suspension.");
	}
}
