package com.designpatterns.structural.decorator_10;

public class NuttyDecorator_4 extends IcecreamDecorator {

	public NuttyDecorator_4(Icecream_1 specialIcecream) {
		super(specialIcecream);
	}

	public String makeIcecream() {
		return specialIcecream.makeIcecream() + addNuts();
	}

	private String addNuts() {
		return " + cruncy nuts";
	}
}
