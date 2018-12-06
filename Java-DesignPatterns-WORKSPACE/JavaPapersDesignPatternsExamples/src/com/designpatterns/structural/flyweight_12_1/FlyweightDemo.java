package com.designpatterns.structural.flyweight_12_1;

public class FlyweightDemo {
	public static final int ROWS = 6, COLS = 10;

	public static void main(String[] args) {
		Gazillion_1[][] matrix = new Gazillion_1[ROWS][COLS];
		for (int i = 0; i < ROWS; i++)
			for (int j = 0; j < COLS; j++)
				matrix[i][j] = new Gazillion_1(COLS);
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++)
				matrix[i][j].report();
			System.out.println();
		}
	}
}
