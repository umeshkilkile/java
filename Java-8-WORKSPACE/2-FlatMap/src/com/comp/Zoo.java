package com.comp;

import java.util.HashSet;
import java.util.Set;

class Zoo {
	private String zooName;
	private Set<String> animals;

	public Zoo(String zooName) {
		this.zooName = zooName;
		this.animals = new HashSet<>();
	}

	public void add(String animal) {
		this.animals.add(animal);
	}

	public Set<String> getAnimals() {
		return animals;
	}
}