package com.designpatterns.behavioral.strategy_24;

public class StrategyDemo_6 {
	public static void clientCode(Strategy_1 strat) {
		strat.solve();
	}

	public static void main(String[] args) {
		Strategy_1[] algorithms = { new Impl_3(), new Impl_5() };
		for (int i = 0; i < algorithms.length; i++) {
			clientCode(algorithms[i]);
		}
	}
}
