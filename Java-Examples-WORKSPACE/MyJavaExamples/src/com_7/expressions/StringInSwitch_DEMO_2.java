package com_7.expressions;

/*
 * We can use String in switch.  Its a Java 7 feature
 */
public class StringInSwitch_DEMO_2 {
	public static void main(String[] args) {
		
		/*
		 * Using Strings in switch
		 */
		String s = "april";

		switch (s.toLowerCase()) {
		case "january":
			System.out.println("January");
			break;

		case "february":
			System.out.println("February");
			break;

		case "march":
			System.out.println("March");
			break;

		case "april":
			System.out.println("April");
			break;
		}

		/*
		 * Using primitive in switch
		 */
		int month = 4;

		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		}
	}
}

/*
 * NOTE-1: A switch works with the byte, short, char, and int primitive data
 * types. It also works with enumerated types , the String class, and a few
 * special classes that wrap certain primitive types: Character, Byte, Short,
 * and Integer.
 * 
 * NOTE-2: The String in the switch expression is compared with the expressions
 * associated with each case label as if the String.equals method were being
 * used. To confirm this NOTE-2 you can check the generated .class file
 */