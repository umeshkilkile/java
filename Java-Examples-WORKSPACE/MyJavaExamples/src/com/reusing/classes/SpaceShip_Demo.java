package com.reusing.classes;

public class SpaceShip_Demo extends SpaceShipControls {
	private String name;

	public SpaceShip_Demo(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		SpaceShip_Demo protector = new SpaceShip_Demo("NSEA Protector");
		protector.forward(100);
	}
}
/*
 * - WITHOUT DELEGATION
 * 
 * However, a SpaceShip isn’t really “a type of” SpaceShipControls, even if, for
 * example, you “tell” a SpaceShip to go forward( ). It’s more accurate to say
 * that a SpaceShip contains SpaceShipControls, and at the same time all the
 * methods in SpaceShipControls are exposed in a SpaceShip.
 */