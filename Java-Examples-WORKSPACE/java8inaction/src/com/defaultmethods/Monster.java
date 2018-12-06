package com.defaultmethods;

/*
 * The Monster class will automatically inherit the default methods from the Rotatable, Moveable,
and Resizable interfaces. In this case, Monster inherits the implementations of rotateBy,
moveHorizontally, moveVertically, and setRelativeSize.
 */
public class Monster implements Rotatable, Moveable, Resizable {
	// Needs to provide implementation for all abstract methods but not the
	// default methods
	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAbsoluteSize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRotationalAngle(int angleInDegrees) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getRotationalAngle() {
		// TODO Auto-generated method stub
		return 0;
	}

}
