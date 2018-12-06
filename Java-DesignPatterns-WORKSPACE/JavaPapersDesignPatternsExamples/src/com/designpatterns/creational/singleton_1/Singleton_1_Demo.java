package com.designpatterns.creational.singleton_1;

public class Singleton_1_Demo {

	public static void main(String[] args) {

		Singleton_1 singleton = Singleton_1.getInstance();
		System.out.println("First Instance : " + singleton);

		Singleton_1 singleton2 = Singleton_1.getInstance();
		System.out.println("Second Instance : " + singleton2);

	}
}
