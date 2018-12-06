package com.designpatterns.creational.singleton_1;

public class Singleton_2_Demo {

	public static void main(String[] args) {

		Singleton_2 singleton = Singleton_2.getSingleInstance();
		System.out.println("First Instance : " + singleton);

		Singleton_2 singleton2 = Singleton_2.getSingleInstance();
		System.out.println("Second Instance : " + singleton2);

	}
}
