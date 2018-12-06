package com.optional;

public class Insurance1 {
	// An insurance company must have a name
	private String name;

	public String getName() {
		return name;
	}
}

/*
 * It’s important to note that the intention of the Optional class is not to
 * replace every single null reference. Instead, its purpose is to help you
 * design more-comprehensible APIs so that by just reading the signature of a
 * method, you can tell whether to expect an optional value. This forces you to
 * actively unwrap an optional to deal with the absence of a value.
 */