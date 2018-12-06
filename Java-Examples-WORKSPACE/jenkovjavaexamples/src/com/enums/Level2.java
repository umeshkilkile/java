package com.enums;

public enum Level2 {
	HIGH(3), // calls constructor with value 3
	MEDIUM(2), // calls constructor with value 2
	LOW(1) // calls constructor with value 1
	; // semicolon needed when fields / methods follow

	private final int levelCode;

	private Level2(int levelCode) {
		System.out.println(levelCode);
		this.levelCode = levelCode;
	}
}

/*
 * The enum constructor must be either private or package scope (default). You
 * cannot use public or protected constructors for a Java enum.
 */