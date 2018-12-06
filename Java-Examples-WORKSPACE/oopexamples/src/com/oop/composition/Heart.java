package com.oop.composition;

public class Heart {
	public String blood;
	public int heartBeat;

	public void pumps() {
		System.out.println("Heart pumps blood!");
	}

	Heart(String blood, int heartBeat) {
		this.blood = blood;
		this.heartBeat = heartBeat;
	}

	@Override
	public String toString() {
		return "Heart [blood=" + blood + ", heartBeat=" + heartBeat + "]";
	}

}
