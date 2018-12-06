package com.designpatterns.behavioral.mediator_19;

public interface IATCMediator_1 {
	public void registerRunway(Runway_5 runway);

	public void registerFlight(Flight_4 flight);

	public boolean isLandingOk();

	public void setLandingStatus(boolean status);

}
