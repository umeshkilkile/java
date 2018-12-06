package com.designpatterns.structural.flyweight_12_2;

public class FlyweightDemo {
	public static final int ROWS = 6, COLS = 10;

	public static void main(String[] args) {
		Factory_2 theFactory = new Factory_2(ROWS);
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++)
				theFactory.getFlyweight(i).report(j);
			System.out.println();
		}
	}
}
