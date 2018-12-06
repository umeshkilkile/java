package com.designpatterns.behavioral.memento_20;

import java.util.ArrayList;
import java.util.List;

public class Caretaker_3 {
	private List<Memento_1> statesList = new ArrayList<Memento_1>();

	public void addMemento(Memento_1 m) {
		statesList.add(m);
	}

	public Memento_1 getMemento(int index) {
		return statesList.get(index);
	}

}
