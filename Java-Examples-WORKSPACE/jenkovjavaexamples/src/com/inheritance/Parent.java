package com.inheritance;

public class Parent {
	int x = 1;
	int y = 1;

	public int getX() {
		System.out.println("From Parent");
		return x;
	}

	public void setX(int x) {
		System.out.println("From Parent");
		this.x = x;
	}

	public int getY() {
		System.out.println("From Parent");
		return y;
	}

	public void setY(int y) {
		System.out.println("From Parent");
		this.y = y;
	}

	public void m1() {
		System.out.println("From Parent");
		System.out.println(x + y);
	}
}
