package com_37.threads;

public class Immutable_Demo_8 {
	public static void main(String[] args) {
		SynchronizedRGB_Immutable mutable = new SynchronizedRGB_Immutable(50,
				100, 250, "Umesh");
		System.out.println(mutable.getName());
	}
}
