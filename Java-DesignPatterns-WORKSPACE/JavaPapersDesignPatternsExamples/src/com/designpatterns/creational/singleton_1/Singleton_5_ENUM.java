package com.designpatterns.creational.singleton_1;

public enum Singleton_5_ENUM {

	INSTANCE;

	public static Singleton_5_ENUM getInstance() {
		return Singleton_5_ENUM.INSTANCE;
	}

	public void anyStuff() {
		System.out.println("Singleton using Enum");
	}
}
