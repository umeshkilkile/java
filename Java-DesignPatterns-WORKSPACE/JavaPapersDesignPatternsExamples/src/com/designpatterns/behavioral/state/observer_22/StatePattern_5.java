package com.designpatterns.behavioral.state.observer_22;

public class StatePattern_5 {
	public static void main(String[] args) {
		AlertStateContext_2 stateContext = new AlertStateContext_2();
		stateContext.alert();
		stateContext.alert();
		stateContext.setState(new Silent_4());
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
	}

}
