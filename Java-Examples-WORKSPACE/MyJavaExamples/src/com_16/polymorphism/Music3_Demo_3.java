package com_16.polymorphism;

public class Music3_Demo_3 {
	// Doesn’t care about type, so new types added to the system still work
	// right:
	public static void tune(Instrument2 i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument2[] e) {
		for (Instrument2 i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument2[] orchestra = { new Wind2(), new Percussion2(), new Stringed2(), new Brass2(), new Woodwind2() };
		tuneAll(orchestra);
	}
}

/*
 * polymorphism is an important technique for the programmer to “separate the
 * things that change from the things that stay the same.”
 */