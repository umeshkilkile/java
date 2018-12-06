package com_14.interfaces;

/*
 *  An interface is a reference type, similar to a class, that can contain only constants, method signatures, 
 *  default methods, static methods, and nested types
 */
public interface OperateCar_DEMO_2 {
	// constant declarations, if any

	// method signatures

	enum Direction {
		RIGHT, LEFT
	}

	// An enum with values RIGHT, LEFT
	int turn(Direction direction, double radius, double startSpeed, double endSpeed);

	int changeLanes(Direction direction, double startSpeed, double endSpeed);

	int signalTurn(Direction direction, boolean signalOn);

	int getRadarFront(double distanceToCar, double speedOfCar);

	int getRadarRear(double distanceToCar, double speedOfCar);
	// more method signatures
}
