package com.inheritance;

public class Child extends Parent {
	int x = 2;
	int y = 2;

	public int getX() {
		System.out.println("From Child");
		return x;
	}

	public void setX(int x) {
		System.out.println("From Child");
		this.x = x;
	}

	public int getY() {
		System.out.println("From Child");
		return y;
	}

	public void setY(int y) {
		System.out.println("From Child");
		this.y = y;
	}

	public void m1() {
		System.out.println("From Child");
		System.out.println(x + y);
	}
}
