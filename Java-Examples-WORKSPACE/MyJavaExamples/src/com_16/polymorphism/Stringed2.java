package com_16.polymorphism;

class Stringed2 extends Instrument2 {
	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	String what() {
		return "Stringed";
	}

	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}
