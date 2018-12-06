package com_12.enums;

public enum TrafficSignal {
	// This will call enum constructor with one
	// String argument
	RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

	// declaring private variable for getting values
	private String action;

	// getter method
	public String getAction() {
		return this.action;
	}

	// enum constructor - cannot be public or protected
	private TrafficSignal(String action) {
		this.action = action;
	}
}
