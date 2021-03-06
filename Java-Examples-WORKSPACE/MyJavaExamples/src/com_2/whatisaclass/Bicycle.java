package com_2.whatisaclass;

/*
 *  A class is the blueprint from which individual objects are created.
 */

class Bicycle {

	/*
	 * The fields cadence, speed, and gear represent the object's state.
	 */
	int cadence = 0;
	int speed = 0;
	int gear = 1;

	public Bicycle() {

	}

	/*
	 * Methods (changeCadence, changeGear, speedUp etc.) define behavior and its
	 * interaction with the outside world.
	 */
	void changeCadence(int newValue) {
		cadence = newValue;
	}

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
	}
}

/*
 * NOTE-1 : You don't have to provide any constructors for your class, but you
 * must be careful when doing this. The compiler automatically provides a
 * no-argument, default constructor for any class without constructors. This
 * default constructor will call the no-argument constructor of the superclass.
 * In this situation, the compiler will complain if the superclass doesn't have
 * a no-argument constructor so you must verify that it does. If your class has
 * no explicit superclass, then it has an implicit superclass of Object, which
 * does have a no-argument constructor.
 * 
 * NOTE-2 : The phrase "instantiating a class" means the same thing as
 * "creating an object." When you create an object, you are creating an
 * "instance" of a class, therefore "instantiating" a class.
 */
