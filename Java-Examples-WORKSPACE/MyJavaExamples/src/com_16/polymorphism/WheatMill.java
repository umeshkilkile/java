package com_16.polymorphism;

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}
