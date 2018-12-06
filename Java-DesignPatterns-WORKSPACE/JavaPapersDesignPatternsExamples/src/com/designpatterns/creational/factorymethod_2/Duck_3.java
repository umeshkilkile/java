package com.designpatterns.creational.factorymethod_2;

/*
 * sub class 2 that might get instantiated by a factory method pattern
 */
public class Duck_3 implements Pet_1 {

	@Override
	public String speak() {
		return "Quack quack";
	}
	
}
