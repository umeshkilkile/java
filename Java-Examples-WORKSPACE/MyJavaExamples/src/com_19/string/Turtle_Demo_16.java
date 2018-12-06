package com_19.string;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle_Demo_16 {
	private String name;
	private Formatter f;

	public Turtle_Demo_16(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}

	public void move(int x, int y) {
		f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
	}

	public static void main(String[] args) {
		PrintStream outAlias = System.out;
		Turtle_Demo_16 tommy = new Turtle_Demo_16("Tommy", new Formatter(System.out));
		Turtle_Demo_16 terry = new Turtle_Demo_16("Terry", new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
	}
}
/*
 * All of Java’s new formatting functionality is handled by the Formatter class
 * in the java.util package. You can think of Formatter as a translator that
 * converts your format string and data into the desired result. When you create
 * a Formatter object, you tell it where you want this result to go by passing
 * that information to the constructor
 */