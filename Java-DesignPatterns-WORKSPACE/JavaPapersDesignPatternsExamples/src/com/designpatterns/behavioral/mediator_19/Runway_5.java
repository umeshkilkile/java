package com.designpatterns.behavioral.mediator_19;

public class Runway_5 implements Command_3 {
	private IATCMediator_1 atcMediator;

	public Runway_5(IATCMediator_1 atcMediator) {
		this.atcMediator = atcMediator;
		atcMediator.setLandingStatus(true);
	}

	@Override
	public void land() {
		System.out.println("Landing permission granted...");
		atcMediator.setLandingStatus(true);
	}

}
