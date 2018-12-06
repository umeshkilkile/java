package com_19.string;

public class Coffee {
	private int id;
	private String name;

	public Coffee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coffee [id=" + id + ", name=" + name + "]";
	}
}
