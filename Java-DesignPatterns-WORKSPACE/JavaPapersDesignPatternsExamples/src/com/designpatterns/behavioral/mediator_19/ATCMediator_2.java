package com.designpatterns.behavioral.mediator_19;

public class ATCMediator_2 implements IATCMediator_1 {
	private Flight_4 flight;
	private Runway_5 runway;
	public boolean land;

	public void registerRunway(Runway_5 runway) {
		this.runway = runway;
	}

	public void registerFlight(Flight_4 flight) {
		this.flight = flight;
	}

	public boolean isLandingOk() {
		return land;
	}

	@Override
	public void setLandingStatus(boolean status) {
		land = status;
	}

}
