package com_9.classesandobjects;

/*
 * 
 * Note 1: In the spirit of encapsulation, it is common to make fields private. This
 * means that they can only be directly accessed from the Bicycle class. We
 * still need access to these values, however. This can be done indirectly by
 * adding public methods that obtain the field values for us:
 * 
 */
public class Bicycle_DEMO_3 {
	private int cadence;
	private int gear;
	private int speed;

	public Bicycle_DEMO_3(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public int getSpeed() {
		return speed;
	}

	/*
	 * - Methods in Java determine the messages an object can receive.
	 * 
	 * - The method name and argument list (which is called the signature of the
	 * method) uniquely identify that method.
	 * 
	 */
	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}
}
