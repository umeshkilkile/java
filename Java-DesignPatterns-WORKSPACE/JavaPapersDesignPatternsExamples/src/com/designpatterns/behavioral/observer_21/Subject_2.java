package com.designpatterns.behavioral.observer_21;

public interface Subject_2 {
	public void registerObserver(Observer_1 observer);

	public void notifyObserver();

	public void unRegisterObserver(Observer_1 observer);

	public Object getUpdate();

}
