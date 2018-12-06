package com.designpatterns.behavioral.mediator_19;

public class MediatorDesignPattern_Demo_6 {
	public static void main(String args[]) {
		IATCMediator_1 atcMediator = new ATCMediator_2();
		Flight_4 sparrow101 = new Flight_4(atcMediator);
		Runway_5 mainRunway = new Runway_5(atcMediator);
		atcMediator.registerFlight(sparrow101);
		atcMediator.registerRunway(mainRunway);
		sparrow101.getReady();
		mainRunway.land();
		sparrow101.land();
	}

}
