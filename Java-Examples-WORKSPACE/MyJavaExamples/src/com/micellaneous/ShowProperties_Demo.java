package com.micellaneous;

public class ShowProperties_Demo {
	public static void main(String[] args) {
		/*
		 * The list( ) method sends the results to its argument, System.out.
		 */
		System.getProperties().list(System.out);
		
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
}
