package com.reusing.classes;

public class Villain2 {
	private String name;

	protected void set(String nm) {
		name = nm;
	}

	public Villain2(String name) {
		this.name = name;
	}

	public String toString() {
		return "I’m a Villain and my name is " + name;
	}
}
