package com.annotations;

public class MyNewComponent {

	@Deprecated
	public int value = 100;

	@Deprecated
	public void m1() {
		System.out.println("Deprecated method");
	}

	@Deprecated
	MyNewComponent() {

	}
}
