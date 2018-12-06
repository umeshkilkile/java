package com.designpatterns.creational.singleton_1;

public class Singleton_3_Demo {
	public static void main(String[] args) {
		
		Singleton_3 singleton = Singleton_3.getInstance();
		System.out.println("First Instance : " + singleton);

		Singleton_3 singleton2 = Singleton_3.getInstance();
		System.out.println("Second Instance : " + singleton2);
	}
}
