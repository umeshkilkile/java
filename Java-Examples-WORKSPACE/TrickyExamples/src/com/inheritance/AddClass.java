package com.inheritance;

public class AddClass implements AddInterface {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num2 - num1;
	}

}
