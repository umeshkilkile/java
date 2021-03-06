package com_16.polymorphism;

public class Music2_Demo_2 {
	public static void tune(Wind i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tune(Stringed i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tune(Brass i) {
		i.play(Note.MIDDLE_C);
	}

	/*
	 * Overloading instead of upcasting.
	 */
	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute); // No upcasting
		tune(violin);
		tune(frenchHorn);
	}
}
/*
 * Wouldn�t it be much nicer if you could just write a single method that takes
 * the base class as its argument, and not any of the specific derived classes?
 * That is, wouldn�t it be nice if you could forget that there are derived
 * classes, and write your code to talk only to the base class?
 * 
 * That�s exactly what polymorphism allows you to do.
 */