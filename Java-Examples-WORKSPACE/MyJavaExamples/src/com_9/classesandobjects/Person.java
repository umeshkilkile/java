package com_9.classesandobjects;

public class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy " + peeled.s);
	}
}
