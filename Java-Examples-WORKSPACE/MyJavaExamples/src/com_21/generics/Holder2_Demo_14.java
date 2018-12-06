package com_21.generics;

// Before Java SE5, we would simply make it hold an Object:
public class Holder2_Demo_14 {
	private Object a;

	public Holder2_Demo_14(Object a) {
		this.a = a;
	}

	public void set(Object a) {
		this.a = a;
	}

	public Object get() {
		return a;
	}

	public static void main(String[] args) {
		Holder2_Demo_14 h2 = new Holder2_Demo_14(new Automobile());
		Automobile a = (Automobile) h2.get();
		h2.set("Not an Automobile");
		String s = (String) h2.get();
		System.out.println(s);
		h2.set(1); // Autoboxes to Integer
		Integer x = (Integer) h2.get();
		System.out.println(x);
	}
}
/*
 * Now a Holder2_Demo_14 can hold anything—and in this example, a single Holder2
 * holds three different types of objects.
 */