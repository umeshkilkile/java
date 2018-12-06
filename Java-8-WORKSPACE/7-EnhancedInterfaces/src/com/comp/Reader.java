package com.comp;

public interface Reader {

	public String read();

	public default String defaultRead() {
		return "Using default reader";
	}
}
