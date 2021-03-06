package com.enums;

public class Demo_4 {
	public static void main(String[] args) {
		/*
		 * You call an enum method via a reference to one of the constant
		 * values. Here is Java enum method call example:
		 */
		Level3 level = Level3.HIGH;
		System.out.println(level.getLevelCode());
	}
}

/*
 * - Java enums extend the java.lang.Enum class implicitly, so your enum types
 * cannot extend another class.
 * 
 * - If a Java enum contains fields and methods, the definition of fields and
 * methods must always come after the list of constants in the enum.
 * Additionally, the list of enum constants must be terminated by a semicolon;
 */