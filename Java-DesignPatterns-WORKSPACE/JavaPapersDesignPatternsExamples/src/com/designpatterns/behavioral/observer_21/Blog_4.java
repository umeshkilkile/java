package com.designpatterns.behavioral.observer_21;

import java.util.ArrayList;
import java.util.List;

public class Blog_4 implements Subject_2 {
	List<Observer_1> observersList;
	private boolean stateChange;

	public Blog_4() {
		this.observersList = new ArrayList<Observer_1>();
		stateChange = false;
	}

	public void registerObserver(Observer_1 observer) {
		observersList.add(observer);
	}

	public void unRegisterObserver(Observer_1 observer) {
		observersList.remove(observer);
	}

	public void notifyObserver() {
		if (stateChange) {
			for (Observer_1 observer : observersList) {
				observer.update();
			}
		}
	}

	public Object getUpdate() {
		Object changedState = null;
		// should have logic to send the
		// state change to querying observer
		if (stateChange) {
			changedState = "Observer Design Pattern";
		}
		return changedState;
	}

	public void postNewArticle() {
		stateChange = true;
		notifyObserver();
	}

}
