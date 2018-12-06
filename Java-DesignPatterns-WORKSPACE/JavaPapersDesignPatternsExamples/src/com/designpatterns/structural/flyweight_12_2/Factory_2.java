package com.designpatterns.structural.flyweight_12_2;

public class Factory_2 {
	private Gazillion_1[] pool;

	public Factory_2(int maxRows) {
		pool = new Gazillion_1[maxRows];
	}

	public Gazillion_1 getFlyweight(int theRow) {
		if (pool[theRow] == null)
			pool[theRow] = new Gazillion_1(theRow);
		return pool[theRow];
	}
}
