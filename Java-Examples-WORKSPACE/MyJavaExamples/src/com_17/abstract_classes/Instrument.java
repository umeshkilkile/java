package com_17.abstract_classes;

abstract class Instrument {
	private int i; // Storage allocated for each

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}