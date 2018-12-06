package com_16.polymorphism;

/*
 * Upcasting revisited
 * 		- Taking an object reference and treating it as a reference to its base type is called upcasting because of the way inheritance trees are drawn with the base class at the top.
 */
public class Music_Demo_1 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute); // Upcasting
	}
}

/*
 * The method Music.tune( ) accepts an Instrument reference, but also anything
 * derived from Instrument. In main( ), you can see this happening as a Wind
 * reference is passed to tune( ), with no cast necessary. This is
 * acceptable—the interface in Instrument must exist in Wind, because Wind is
 * inherited from Instrument. Upcasting from Wind to Instrument may “narrow”
 * that interface, but it cannot make it anything less than the full interface
 * to Instrument.
 */