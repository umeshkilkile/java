package com.designpatterns.creational.doubleton;

public class DoubleTonDemo {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			DoubleTon doubleTon = DoubleTon.getInstance();
			System.out.println(doubleTon);
		}
	}
}
