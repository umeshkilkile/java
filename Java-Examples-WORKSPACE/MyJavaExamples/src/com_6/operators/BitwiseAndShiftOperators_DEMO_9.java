package com_6.operators;

public class BitwiseAndShiftOperators_DEMO_9 {
	public static void main(String[] args) {
		int bitmask = 0x000F;
		int val = 0x2222;
		// prints "2"
		System.out.println(val & bitmask);
	}
}
