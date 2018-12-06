package com.access.specifiers2;

import com.access.specifiers.Cookie;

public class ChocolateChip_Demo extends Cookie {
	public ChocolateChip_Demo() {
		System.out.println("ChocolateChip constructor");
	}

	public void chomp() {
		/*
		 * One of the interesting things about inheritance is that if a method
		 * bite( ) exists in class Cookie, then it also exists in any class
		 * inherited from Cookie. But since bite( ) has package access and is in
		 * a foreign package, it’s unavailable to us in this one.
		 */
		// bite(); // Can’t access bite
	}

	public static void main(String[] args) {
		ChocolateChip_Demo x = new ChocolateChip_Demo();
		x.chomp();
	}
}
