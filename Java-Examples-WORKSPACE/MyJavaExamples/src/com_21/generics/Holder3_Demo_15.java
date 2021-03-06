package com_21.generics;

public class Holder3_Demo_15<T> {
	private T a;

	public Holder3_Demo_15(T a) {
		this.a = a;
	}

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}

	public static void main(String[] args) {
		Holder3_Demo_15<Automobile> h3 = new Holder3_Demo_15<Automobile>(new Automobile());
		Automobile a = h3.get(); // No cast needed
		// h3.set("Not an Automobile"); // Error
		// h3.set(1); // Error

		Holder3_Demo_15<String> h4 = new Holder3_Demo_15<String>("Hello");
		String a1 = h4.get(); // No cast needed
		System.out.println(a1);
	}
}
