package com.designpatterns.behavioral.memento_20;

public class Originator_2 {
	// this String is just for example
	// in real world application this
	// will be a java class - the object
	// for which the state to be stored
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento_1 createMemento() {
		return new Memento_1(state);
	}

	public void setMemento(Memento_1 memento) {
		state = memento.getState();
	}

}
