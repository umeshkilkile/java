package com_21.generics;

public class B extends A {
	String name;

	B() {

	}

	B(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
