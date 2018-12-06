package com.designpatterns.behavioral.strategy_24;

public abstract class TemplateMethod_4 implements Strategy_1 {
	public void solve() {
		while (true) {
			preProcess();
			if (search())
				break;
			postProcess();
		}
	}

	protected abstract void preProcess();

	protected abstract boolean search();

	protected abstract void postProcess();
}