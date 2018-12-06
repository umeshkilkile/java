package com.designpatterns.behavioral.mediator_19;

public class Flight_4 implements Command_3 {
	private IATCMediator_1 atcMediator;

	public Flight_4(IATCMediator_1 atcMediator) {
		this.atcMediator = atcMediator;
	}

	public void land() {
		if (atcMediator.isLandingOk()) {
			System.out.println("Landing done....");
			atcMediator.setLandingStatus(true);
		} else
			System.out.println("Will wait to land....");
	}

	public void getReady() {
		System.out.println("Getting ready...");
	}

}
