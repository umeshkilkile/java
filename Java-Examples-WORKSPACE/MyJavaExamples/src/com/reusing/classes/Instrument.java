package com.reusing.classes;

//Inheritance & upcasting.
class Instrument {
	public void play() {
		System.out.println("Instrument.play()");
	}

	static void tune(Instrument i) {
		i.play();
	}
}
