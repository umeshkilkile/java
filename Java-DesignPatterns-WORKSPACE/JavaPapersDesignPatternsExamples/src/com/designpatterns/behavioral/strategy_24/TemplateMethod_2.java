package com.designpatterns.behavioral.strategy_24;

public abstract class TemplateMethod_2 implements Strategy_1 {

	public void solve() {
		start();
		while (nextTry() && !isSolution())
			;
		stop();
	}

	protected abstract void start();

	protected abstract boolean nextTry();

	protected abstract boolean isSolution();

	protected abstract void stop();

}
