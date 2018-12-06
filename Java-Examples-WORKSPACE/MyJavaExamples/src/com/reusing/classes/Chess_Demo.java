package com.reusing.classes;

public class Chess_Demo extends BoardGame {
	Chess_Demo() {
		super(11);
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		Chess_Demo x = new Chess_Demo();
	}
}

/*
 * If you don’t call the base-class constructor in BoardGame( ), the compiler
 * will complain that it can’t find a constructor of the form Game( ). In
 * addition, the call to the base-class constructor must be the first thing you
 * do in the derived-class constructor. (The compiler will remind you if you get
 * it wrong.)
 */