package com.designpatterns.creational.singleton_1;

public class Singleton_4_Demo {

	public static void main(String args[]) {
		
		Singleton_4 singleton = Singleton_4.getInstance();
		System.out.println("First Instance : " + singleton);

		Singleton_4 singleton2 = Singleton_4.getInstance();
		System.out.println("Second Instance : " + singleton2);
	}
}
