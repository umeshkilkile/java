package com_17.abstract_classes;

class Woodwind extends Wind {
	public void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}

	public String what() {
		return "Woodwind";
	}
}
