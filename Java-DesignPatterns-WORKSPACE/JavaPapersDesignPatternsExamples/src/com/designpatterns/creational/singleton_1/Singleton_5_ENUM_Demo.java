package com.designpatterns.creational.singleton_1;

public class Singleton_5_ENUM_Demo {

	public static void main(String[] args) {

		Singleton_5_ENUM singletonInstance = Singleton_5_ENUM.getInstance();
		System.out.println("singletonInstance1 : "	+ singletonInstance.hashCode());
		singletonInstance.anyStuff();

		Singleton_5_ENUM singletonInstance2 = Singleton_5_ENUM.getInstance();
		System.out.println("singletonInstance2 : " + singletonInstance2.hashCode());
		singletonInstance2.anyStuff();

		Singleton_5_ENUM singletonInstance3 = Singleton_5_ENUM.INSTANCE;
		System.out.println("singletonInstance3 : " + singletonInstance3.hashCode());
		singletonInstance3.anyStuff();

	}
}
