package com.reusing.classes;

public class SpaceShipDelegation_Demo {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();

	public SpaceShipDelegation_Demo(String name) {
		this.name = name;
	}

	// Delegated methods:
	public void back(int velocity) {
		controls.back(velocity);
	}

	public void down(int velocity) {
		controls.down(velocity);
	}

	public void forward(int velocity) {
		System.out.println("SpaceShipDelegation_Demo.forward()" + velocity);
		controls.forward(velocity);
	}

	public void left(int velocity) {
		controls.left(velocity);
	}

	public void right(int velocity) {
		controls.right(velocity);
	}

	public void turboBoost() {
		controls.turboBoost();
	}

	public void up(int velocity) {
		controls.up(velocity);
	}

	public static void main(String[] args) {
		SpaceShipDelegation_Demo protector = new SpaceShipDelegation_Demo("NSEA Protector");
		protector.forward(100);
	}
}

/*
 * - WITH DELEGATION
 * 
 * You can see how the methods are forwarded to the underlying controls object,
 * and the interface is thus the same as it is with inheritance. However, you
 * have more control with delegation because you can choose to provide only a
 * subset of the methods in the member object.
 */