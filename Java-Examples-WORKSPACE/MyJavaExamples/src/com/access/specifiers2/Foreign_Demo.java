package com.access.specifiers2;

import com.access.specifiers.*;

public class Foreign_Demo {
	public static void main(String[] args) {

		/*
		 * Can not create object, because it has default access (package
		 * private)
		 */
		PackagedClass pc = new PackagedClass();
	}
}