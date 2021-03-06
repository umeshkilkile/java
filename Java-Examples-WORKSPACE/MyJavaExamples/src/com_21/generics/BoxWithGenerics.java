package com_21.generics;

/*
 * Raw type
 */
public class BoxWithGenerics<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}