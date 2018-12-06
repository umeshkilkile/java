package com.designpatterns.structural.decorator_10;

public class HoneyDecorator_5 extends IcecreamDecorator {

	public HoneyDecorator_5(Icecream_1 specialIcecream) {
		super(specialIcecream);
	}

	public String makeIcecream() {
		return specialIcecream.makeIcecream() + addHoney();
	}

	private String addHoney() {
		return " + sweet honey";
	}
}
