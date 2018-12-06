package com.access.specifiers2;

import com.access.specifiers.Cookie;

public class Dinner_Demo {
	public static void main(String[] args) {
		Cookie x = new Cookie();
		/*
		 * Can’t access.The method bite() from the type Cookie is not visible
		 * (Its package private)
		 */
		// x.bite();
	}
}
