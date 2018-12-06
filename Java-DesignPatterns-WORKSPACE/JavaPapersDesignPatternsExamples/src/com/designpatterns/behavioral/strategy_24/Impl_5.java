package com.designpatterns.behavioral.strategy_24;

public class Impl_5 extends TemplateMethod_4 {
	private int state = 1;

	protected void preProcess() {
		System.out.print("preProcess  ");
	}

	protected void postProcess() {
		System.out.print("postProcess  ");
	}

	protected boolean search() {
		System.out.print("search-" + state++ + "  ");
		return state == 3 ? true : false;
	}
}
