package com_16.polymorphism;

class Woodwind2 extends Wind2 {
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}

	String what() {
		return "Woodwind";
	}
}