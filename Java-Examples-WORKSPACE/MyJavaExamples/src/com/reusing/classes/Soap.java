package com.reusing.classes;

//Constructor initialization with composition.
public class Soap {
	private String s;

	Soap() {
		System.out.println("Soap()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}
