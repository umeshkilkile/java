package com.designpatterns.behavioral.state.observer_22;

public class Silent_4 implements MobileAlertState_1 {
	@Override
	public void alert(AlertStateContext_2 ctx) {
		System.out.println("silent...");
	}
}
