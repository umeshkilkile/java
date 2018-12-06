package com.designpatterns.behavioral.state.observer_22;

public class Vibration_3 implements MobileAlertState_1 {
	@Override
	public void alert(AlertStateContext_2 ctx) {
		System.out.println("vibration...");
	}
}
