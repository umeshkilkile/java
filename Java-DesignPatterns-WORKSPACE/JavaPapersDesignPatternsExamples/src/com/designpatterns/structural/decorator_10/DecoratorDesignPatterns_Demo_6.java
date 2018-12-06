package com.designpatterns.structural.decorator_10;

public class DecoratorDesignPatterns_Demo_6 {
	public static void main(String args[]) {
		Icecream_1 icecream = new HoneyDecorator_5(new NuttyDecorator_4(new SimpleIcecream_2()));
		System.out.println(icecream.makeIcecream());
		
		Icecream_1 icecream2 = new NuttyDecorator_4(new HoneyDecorator_5(new SimpleIcecream_2()));
		System.out.println(icecream2.makeIcecream());
	}
}
