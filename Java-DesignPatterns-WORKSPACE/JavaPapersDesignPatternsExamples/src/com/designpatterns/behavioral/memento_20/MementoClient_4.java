package com.designpatterns.behavioral.memento_20;

public class MementoClient_4 {
	public static void main(String[] args) {
		Originator_2 originator = new Originator_2();
		originator.setState("Lion");
		Memento_1 memento = originator.createMemento();
		Caretaker_3 caretaker = new Caretaker_3();
		caretaker.addMemento(memento);
		originator.setState("Tiger");
		originator.setState("Horse");
		memento = originator.createMemento();
		caretaker.addMemento(memento);
		originator.setState("Elephant");
		System.out.println("Originator Current State: " + originator.getState());
		System.out.println("Originator restoring to previous state...");
		memento = caretaker.getMemento(1);
		originator.setMemento(memento);
		System.out.println("Originator Current State: " + originator.getState());
		System.out.println("Again restoring to previous state...");
		memento = caretaker.getMemento(0);
		originator.setMemento(memento);
		System.out.println("Originator Current State: " + originator.getState());
	}

}
