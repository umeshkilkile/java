package com.designpatterns.behavioral.state.observer_22;

public class AlertStateContext_2 {
	private MobileAlertState_1 currentState;

	public AlertStateContext_2() {
		currentState = new Vibration_3();
	}

	public void setState(MobileAlertState_1 state) {
		currentState = state;
	}

	public void alert() {
		currentState.alert(this);
	}

}
