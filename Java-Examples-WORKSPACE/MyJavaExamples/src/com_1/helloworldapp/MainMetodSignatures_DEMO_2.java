package com_1.helloworldapp;

public class MainMetodSignatures_DEMO_2 {
	
	//Main method signature - 1
	/*public static void main(String[] args) {
		System.out.println("Main method signature - 1");
	}*/
	
	//Main method signature - 2
	public static void main(String... args) {
		System.out.println("Main method signature - 2");
	}
	
	/*protected static void main(String... args) {
		System.out.println("Main method signature - 2");
	}*/
}

/*
Notes - 1. The access modifier for main method must be public always
        2. We can not use default or private or protected
        3. If we use default or private or protected the program compiles but we get error at runtime
 */
