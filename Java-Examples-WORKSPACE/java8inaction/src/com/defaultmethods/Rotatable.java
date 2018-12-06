package com.defaultmethods;

public interface Rotatable {
	void setRotationalAngle(int angleInDegrees);

	int getRotationalAngle();

	// A default implementation for the method rotateBy
	default void rotateBy(int angleInDegrees) {
		setRotationalAngle((getRotationalAngle() + angleInDegrees) % 360);
	}
}
