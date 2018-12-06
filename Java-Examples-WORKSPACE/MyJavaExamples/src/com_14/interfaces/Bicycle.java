package com_14.interfaces;

/**
 * 
 * 1. Interfaces form a contract between the class and the outside world, and
 * this contract is enforced at build time by the compiler.
 * 
 * 2. An interface is a group of related methods with empty bodies
 * 
 */
public interface Bicycle {
	// wheel revolutions per minute
	void changeCadence(int newValue);

	void changeGear(int newValue);

	void speedUp(int increment);

	void applyBrakes(int decrement);
}
