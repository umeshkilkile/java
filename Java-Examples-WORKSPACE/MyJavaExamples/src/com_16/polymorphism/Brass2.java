package com_16.polymorphism;

class Brass2 extends Wind2 {
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	void adjust() {
		System.out.println("Adjusting Brass");
	}
}
