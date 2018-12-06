package com_17.abstract_classes;

class Brass extends Wind {
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	public void adjust() {
		System.out.println("Brass.adjust()");
	}
}
