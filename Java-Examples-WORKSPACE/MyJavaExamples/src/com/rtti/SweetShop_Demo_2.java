package com.rtti;

public class SweetShop_Demo_2 {
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try {
			Class.forName("Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("Couldn�t find Gum");
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
	}
}
/*
 * 
 * - Each of the classes Candy, Gum, and Cookie has a static clause that is
 * executed as the class is loaded for the first time. Information will be
 * printed to tell you when loading occurs for that class. In main( ), the
 * object creations are spread out between print statements to help detect the
 * time of loading.
 * 
 * - You can see from the output that each Class object is loaded only when it�s
 * needed, and the static initialization is performed upon class loading.
 */