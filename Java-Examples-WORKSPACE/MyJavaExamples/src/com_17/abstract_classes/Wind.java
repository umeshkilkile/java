package com_17.abstract_classes;

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	public String what() {
		return "Wind";
	}

	public void adjust() {
	}
}