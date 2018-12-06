package com.annotations;

public @interface MyAnnotation {
	String value();

	String name();

	int age();

	String[] newNames();
}

/*
 * - It is possible to create your own (custom) Java annotations. Annotations
 * are defined in their own file, just like a Java class or interface.
 */