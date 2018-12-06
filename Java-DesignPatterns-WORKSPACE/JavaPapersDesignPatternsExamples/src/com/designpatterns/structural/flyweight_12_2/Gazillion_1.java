package com.designpatterns.structural.flyweight_12_2;

public class Gazillion_1 {
	private int row;

	public Gazillion_1(int theRow) {
		row = theRow;
		System.out.println("ctor: " + row);
	}

	void report(int theCol) {
		System.out.print(" " + row + theCol);
	}
}

/*
 * In this refactoring, the "row" state is considered shareable (within each row
 * anyways), and the "col" state has been externalized (it is supplied by the
 * client when report() is called).
 */