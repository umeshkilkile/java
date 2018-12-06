package com.designpatterns.structural.bridge_8_1;

public abstract class Shape_2 {
	// Composition - implementor
	protected Color_1 color;

	// constructor with implementor as input argument
	public Shape_2(Color_1 c) {
		this.color = c;
	}

	abstract public void applyColor();
}
