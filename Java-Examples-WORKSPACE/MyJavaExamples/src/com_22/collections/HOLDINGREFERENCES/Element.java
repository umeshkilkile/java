package com_22.collections.HOLDINGREFERENCES;

public class Element {
	private String ident;

	public Element(String id) {
		ident = id;
	}

	public String toString() {
		return ident;
	}

	public int hashCode() {
		return ident.hashCode();
	}

	public boolean equals(Object r) {
		return r instanceof Element && ident.equals(((Element) r).ident);
	}

	protected void finalize() {
		System.out.println("Finalizing " + getClass().getSimpleName() + " " + ident);
	}
}
