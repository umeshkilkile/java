package com.annotations;

public class MySuperClass {
	public void doTheThing() {
		System.out.println("Do the thing");
	}

	@SuppressWarnings(value = { "value" })
	public void methodWithWarning() {

	}
}
