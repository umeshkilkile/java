package com.nestedclasses;

//Very simple to just implement the interface
class Callee1 implements Incrementable {
	private int i = 0;

	public void increment() {
		i++;
		System.out.println(i);
	}
}
