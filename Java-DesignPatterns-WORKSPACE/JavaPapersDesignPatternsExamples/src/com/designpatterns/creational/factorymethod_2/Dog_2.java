package com.designpatterns.creational.factorymethod_2;

/*
 * sub class 1 that might get instantiated by a factory method pattern
 */
public class Dog_2 implements Pet_1 {

	@Override
	public String speak() {
		return "Bark bark...";
	}

}
