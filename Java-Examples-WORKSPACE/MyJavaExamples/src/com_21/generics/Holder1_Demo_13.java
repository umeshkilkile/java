package com_21.generics;

public class Holder1_Demo_13 {
	private Automobile a;

	public Holder1_Demo_13(Automobile a) {
		this.a = a;
	}

	Automobile get() {
		return a;
	}

	public static void main(String[] args) {
		Holder1_Demo_13 h2 = new Holder1_Demo_13(new Automobile());
		Automobile a = h2.get();
	}
}
