package com.enums;

public class Demo_1 {
	public static void main(String[] args) {
		Level level = Level.HIGH;
		System.out.println(level);

		// Enums in if Statements
		if (level == Level.HIGH) {
			System.out.println(level);
		} else if (level == Level.MEDIUM) {
			System.out.println(level);
		} else if (level == Level.LOW) {
			System.out.println(level);
		}

		// Enums in switch Statements
		Level level2 = Level.LOW;
		switch (level2) {
		case HIGH:
			System.out.println(level2);
			break;
		case MEDIUM:
			System.out.println(level2);
			break;
		case LOW:
			System.out.println(level2);
			break;
		}
	}
}
