package com_16.polymorphism;

class Percussion2 extends Instrument2 {
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	String what() {
		return "Percussion";
	}

	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}