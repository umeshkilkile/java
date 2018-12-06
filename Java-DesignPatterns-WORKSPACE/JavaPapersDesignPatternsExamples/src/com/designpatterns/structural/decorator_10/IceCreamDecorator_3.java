package com.designpatterns.structural.decorator_10;

abstract class IcecreamDecorator implements Icecream_1 {

	protected Icecream_1 specialIcecream;

	public IcecreamDecorator(Icecream_1 specialIcecream) {
		this.specialIcecream = specialIcecream;
	}

	public String makeIcecream() {
		return specialIcecream.makeIcecream();
	}
}