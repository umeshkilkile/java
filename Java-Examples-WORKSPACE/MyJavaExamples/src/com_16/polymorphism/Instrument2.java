package com_16.polymorphism;

class Instrument2 {
	void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}

	String what() {
		return "Instrument";
	}

	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}