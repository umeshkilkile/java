package com_37.threads;

public class Mutable_Demo_7 {
	public static void main(String[] args) {
		SynchronizedRGB_Mutable mutable = new SynchronizedRGB_Mutable(50, 100, 250, "Umesh");
		System.out.println(mutable.getName());
	}
}
