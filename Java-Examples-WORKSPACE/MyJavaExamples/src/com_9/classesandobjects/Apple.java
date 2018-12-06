package com_9.classesandobjects;

class Apple {
	String s = "Green Apple";

	Apple getPeeled() {
		return Peeler.peel(this);
	}
}